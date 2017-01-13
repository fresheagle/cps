package cps.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import com.google.gson.Gson;

import cn.com.hrbb.cps.SFQ01.bean.DimensionMsg;
import cn.com.hrbb.cps.SFQ01.bean.RequestFQS01;

@SuppressWarnings("deprecation")
public class RestClient {
	private static String serverUrl = "http://localhost:8080/CPS/surface/SFQ/01";
	//private static String serverUrl = "http://130.1.11.249:9080/CPS/surface/SFQ/01";
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TestReq();
	}
	private static void TestReq() throws Exception{
		List<DimensionMsg> Dimen = new ArrayList<DimensionMsg>();

		for(int i = 0;i < 1;i++){
			String DimensionParameter = null;
			if (i == 0){
				DimensionParameter = " A1050 ";
			}
			if (i == 1){
				DimensionParameter = "A";
			}
			if (i == 2){
				DimensionParameter = "C";
			}
			Dimen.add(new DimensionMsg("KHPJ", "",DimensionParameter));
		}
		RequestFQS01 request = new RequestFQS01("SFQ01", "000500","KF", "20160929113038111", Dimen, "0102");
		Gson gson = new Gson();
		String Request = gson.toJson(request);
		System.out.println(Request);
		post(serverUrl,Request);
	}
	@SuppressWarnings("resource")
	public static void post(String httpUrl, String parMap)throws Exception  
    {  
		System.out.println("post:"+httpUrl);
        try {  
            HttpPost request = new HttpPost(httpUrl);  
            StringEntity se = new StringEntity(parMap,"UTF-8");  
            request.setEntity(se);
            se.setContentType("application/json");
            se.setContentEncoding("UTF-8");
			HttpResponse response = new DefaultHttpClient().execute(request);  
            int code = response.getStatusLine().getStatusCode();
            HttpEntity creq = response.getEntity();
            String req = EntityUtils.toString(response.getEntity(),"UTF-8").trim();
            System.out.println("postCode= " + code);
            System.out.println(creq.getContentType());
            System.out.println(response.toString());
            System.out.println(req);
        } catch (Exception e) {  
            System.out.println("HttpClient post error");  
            e.printStackTrace();    
        } 
    }
}
