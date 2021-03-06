/* zTree插件加载目录的处理 */

var zTree;

var setting = {
	view : {
		dblClickExpand : false,
		showLine : false,
		expandSpeed : ($.browser.msie && parseInt($.browser.version) <= 6) ? ""
				: "fast"
	},
	data : {
		key : {
			name : "resourceName"
		},
		simpleData : {
			enable : true,
			idKey : "resourceID",
			pIdKey : "parentID",
			rootPId : ""
		}
	},
	callback : {
		onClick : zTreeOnClick
	}
};

var curExpandNode = null;
function beforeExpand(treeId, treeNode) {
	var pNode = curExpandNode ? curExpandNode.getParentNode() : null;
	var treeNodeP = treeNode.parentTId ? treeNode.getParentNode() : null;
	for (var i = 0, l = !treeNodeP ? 0 : treeNodeP.children.length; i < l; i++) {
		if (treeNode !== treeNodeP.children[i]) {
			zTree.expandNode(treeNodeP.children[i], false);
		}
	}
	while (pNode) {
		if (pNode === treeNode) {
			break;
		}
		pNode = pNode.getParentNode();
	}
	if (!pNode) {
		singlePath(treeNode);
	}

}
function singlePath(newNode) {
	if (newNode === curExpandNode)
		return;
	if (curExpandNode && curExpandNode.open == true) {
		if (newNode.parentTId === curExpandNode.parentTId) {
			zTree.expandNode(curExpandNode, false);
		} else {
			var newParents = [];
			while (newNode) {
				newNode = newNode.getParentNode();
				if (newNode === curExpandNode) {
					newParents = null;
					break;
				} else if (newNode) {
					newParents.push(newNode);
				}
			}
			if (newParents != null) {
				var oldNode = curExpandNode;
				var oldParents = [];
				while (oldNode) {
					oldNode = oldNode.getParentNode();
					if (oldNode) {
						oldParents.push(oldNode);
					}
				}
				if (newParents.length > 0) {
					for (var i = Math.min(newParents.length, oldParents.length) - 1; i >= 0; i--) {
						if (newParents[i] !== oldParents[i]) {
							zTree.expandNode(oldParents[i], false);
							break;
						}
					}
				} else {
					zTree.expandNode(oldParents[oldParents.length - 1], false);
				}
			}
		}
	}
	curExpandNode = newNode;
}

function onExpand(event, treeId, treeNode) {
	curExpandNode = treeNode;
}

/** 用于捕获节点被点击的事件回调函数 * */
function zTreeOnClick(event, treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("dleft_tab1");
	zTree.expandNode(treeNode, null, null, null, true);
	// zTree.expandNode(treeNode);
	// 规定：如果是父类节点，不允许单击操作
	if (treeNode.isParent) {
		// alert("父类节点无法点击哦...");
		return false;
	}
	// 如果节点路径为空或者为"#"，不允许单击操作
	if (treeNode.accessPath == "" || treeNode.accessPath == "#") {
		// alert("节点路径为空或者为'#'哦...");
		return false;
	}
	// 跳到该节点下对应的路径, 把当前资源ID(resourceID)传到后台，写进Session
	rightMain(treeNode.accessPath);

	if (treeNode.isParent) {
		$('#here_area').html(
				'当前位置：' + treeNode.getParentNode().resourceName
						+ '&nbsp;>&nbsp;<span style="color:#1A5CC6">'
						+ treeNode.resourceName + '</span>');
	} else {
		$('#here_area').html(
				'当前位置：系统&nbsp;>&nbsp;<span style="color:#1A5CC6">'
						+ treeNode.resourceName + '</span>');
	}
};

/* 上方菜单 */
function switchTab(tabpage, tabid) {
	var oItem = document.getElementById(tabpage).getElementsByTagName("li");
	for (var i = 0; i < oItem.length; i++) {
		var x = oItem[i];
		x.className = "";
	}
	if ('left_tab1' == tabid) {
		$(document).ajaxStart(onStart).ajaxSuccess(onStop);
		// 异步加载"业务模块"下的菜单
		loadMenu('YEWUMOKUAI', 'dleft_tab1');
	} else if ('left_tab2' == tabid) {
		$(document).ajaxStart(onStart).ajaxSuccess(onStop);
		// 异步加载"系统管理"下的菜单
		loadMenu('XITONGMOKUAI', 'dleft_tab1');
	} else if ('left_tab3' == tabid) {
		$(document).ajaxStart(onStart).ajaxSuccess(onStop);
		// 异步加载"其他"下的菜单
		loadMenu('QITAMOKUAI', 'dleft_tab1');
	}
}

function loadMenu(resourceType, treeObj) {
	/** 加载用户菜单 */
	$.ajax({
		url : "/menu/menus.json",
		success : function(data) {
			if (data != null) {
				// 将返回的数据赋给zTree
				$.fn.zTree.init($("#" + treeObj), setting, data);
				zTree = $.fn.zTree.getZTreeObj(treeObj);
				if (zTree) {
					// 默认展开所有节点
					zTree.expandAll(true);
				}
			}
		}
	});
}

// ajax start function
function onStart() {
	$("#ajaxDialog").show();
}

// ajax stop function
function onStop() {
	$("#ajaxDialog").hide();
}

/** 隐藏或者显示侧边栏* */
function switchSysBar(flag) {
	var side = $('#side');
	var left_menu_cnt = $('#left_menu_cnt');
	if (flag == true) { // flag==true
		left_menu_cnt.show(500, 'linear');
		side.css({
			width : '280px'
		});
		$('#top_nav').css({
			width : '77%',
			left : '304px'
		});
		$('#main').css({
			left : '280px'
		});
	} else {
		if (left_menu_cnt.is(":visible")) {
			left_menu_cnt.hide(10, 'linear');
			side.css({
				width : '60px'
			});
			$('#top_nav').css({
				width : '100%',
				left : '60px',
				'padding-left' : '28px'
			});
			$('#main').css({
				left : '60px'
			});
			$("#show_hide_btn").find('img').attr('src',
					'images/common/nav_show.png');
		} else {
			left_menu_cnt.show(500, 'linear');
			side.css({
				width : '280px'
			});
			$('#top_nav').css({
				width : '77%',
				left : '304px',
				'padding-left' : '0px'
			});
			$('#main').css({
				left : '280px'
			});
			$("#show_hide_btn").find('img').attr('src',
					'images/common/nav_hide.png');
		}
	}
}

$(document).ready(function() {

	$(document).ajaxStart(onStart).ajaxSuccess(onStop);

	/** 退出系统* */
	$("#top_close a").click(function() {
		if (confirm(Lang.info.isSignOut)) {
			window.location.href = "login.html";
		}
	});

	/** 用户登录成功，获取页面初始化用户状态信息 */
	$.ajax({
		url : "/user/state.json",
		success : function(data) {
			$("#dayDate").text(data.date);
			$("#dayWeek").text(Lang.week[data.dayOfWeek]);
		}
	});

	/** 默认异步加载"业务模块"目录 * */
	loadMenu('YEWUMOKUAI', "dleft_tab1");
	
	// 默认展开所有节点
	if (zTree) {
		// 默认展开所有节点
		zTree.expandAll(true);
	}
});

$(document).ready(
		function() {
			$('#TabPage2 li')
					.click(
							function() {
								var index = $(this).index();
								$(this).find('img').attr(
										'src',
										'images/common/' + (index + 1)
												+ '_hover.jpg');
								$(this).css({
									background : '#fff'
								});
								$('#nav_module').find('img').attr(
										'src',
										'images/common/module_' + (index + 1)
												+ '.png');
								$('#TabPage2 li').each(
										function(i, ele) {
											if (i != index) {
												$(ele).find('img').attr(
														'src',
														'images/common/'
																+ (i + 1)
																+ '.jpg');
												$(ele).css({
													background : '#044599'
												});
											}
										});
								// 显示侧边栏
								switchSysBar(true);
							});
			// 显示隐藏侧边栏
			$("#show_hide_btn").click(function() {
				switchSysBar();
			});
		});