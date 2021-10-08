import or.json.JSONObject;
import java.io.BufferReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;

public class currencyconverter {
public static void main(String[] args)
{
    Boolean running = true;

    do{
 HashMap<Integer, String> currencyCodes = new Hashmap<Integer,String> ();

// Add currency codes
currencyCodes.put(1, "USD");
currencyCodes.put(2, "CAD");
currencyCodes.put(3, "EUR");
currencyCodes.put(4, "HKD");
currencyCodes.put(5, "INR");

Integer from, to;
String fromCode, toCode;
double ammount;

Scanner sc = new Scanner(System.in);

System.out.println("Welcome to the Currency Converter!");

System.out.println("Currency Converter From? ");
System.out.println("1:USD (US DOLLARS)\t 2:CAD (CANADIAN DOLLAR) \t 3:EUR (EUROPIAN DOLLAR) \t 4:HKD (HON KONG DOLLAR) \tINR (INDIAN RUPEE");
from = sc.nextInt();
while(from < 1 || from > 5){
    System.out.println("Please select a valid currency (1-5)");
    System.out.println("1:USD (US DOLLARS)\t 2:CAD (CANADIAN DOLLAR) \t 3:EUR (EUROPIAN DOLLAR) \t 4:HKD (HON KONG DOLLAR) \tINR (INDIAN RUPEE");
    from = sc.nextInt();
}
fromCode = currencyCodes.get(from);

System.out.println("Currency Converter To? ");
System.out.println("1:USD (US DOLLARS)\t 2:CAD (CANADIAN DOLLAR) \t 3:EUR (EUROPIAN DOLLAR) \t 4:HKD (HON KONG DOLLAR) \tINR (INDIAN RUPEE");
to = sc.nextInt();
while(to < 1 || to > 5){
    System.out.println("Please select a valid currency (1-5)");
    System.out.println("1:USD (US DOLLARS)\t 2:CAD (CANADIAN DOLLAR) \t 3:EUR (EUROPIAN DOLLAR) \t 4:HKD (HON KONG DOLLAR) \tINR (INDIAN RUPEE");
    to = sc.nextInt();
}
toCode = currencyCodes.get(to);

System.out.println("Amount You Wish To Convert? ");
amount = sc.nectFloat();

sendHttpGETRequest(fromCode, tocode, amount);

system.out.println("Would you like to make another conversion?");
system.out.println("1: YES \t any other integer: NO");
if(sc.nextInt() != 1){
    running = false;
}


} while(running); 

System.out.println("Thank You For Using The Currency Converter! ");
}

private static void sendHttpGETRequest(String fromCode, String toCode, double amount) throws IOException {

DecimalFormat f = DecimalFormat( pattern: "00.00");


String GET URL = "https://api.exchangerateapi.io/latest?base=" + toCode +"&symbols=" + fromCode;
URL url = new URL(GET_URL);
HttpURLConnection httpURLConnection = (HttpURLConnection)  url.openConnection();
HttpURLConnection.setRequestMethod(GET);
int responseCode = httpURLConnection.getResponseCode();

if(responseCode == HttpURLConnection.HTTP_Ok) { //SUCCESS
 BufferReader in = new.BufferReader(new InputStreamReader(httpURLConnection.getInputStream()));
 String inputLine;
 StringBuffer response = new StringBuffer();

while((inputLine = in.readLine()) != null);{
    response.append(inputLine);
}
in.close();
}
JSONObject obj = new JSONObject(response.toString());
Double exchangeRate = obj.getJSONObject("rates").getDout Le(fromCode);
System.out.println(obj.getJSONObject("rates"));
System.out.println(ExchangeRate); //keep for debugging 
System.out.println();
System.out.println(f.format(amount) + fromCode + " = " + f.format (amount/exchangeRate) + toCode);
}
else{
    System.out.println("GET REQUEST FAILED! ");
}
}