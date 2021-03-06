package hk.edu.hkmu.test;

import java.util.ArrayList;
import java.util.HashMap;

public class SchoolInfo {
    public static String schoolid = "ID";
    public static String encat = "Category";
    public static String chcat = "類別";
    public static String enname = "English Name";
    public static String chname = "名稱";
    public static String enaddress = "Address";
    public static String chaddress = "地址";
    public static String engender = "Students Gender";
    public static String chgender = "就讀學生性別";
    public static String ensession = "Session";
    public static String chsession = "學校授課時間";
    public static String endistrict = "District";
    public static String chdistrict = "分區";
    public static String enfintype = "Finance Type";
    public static String chfintype = "資助種類";
    public static String enlevel = "School Level";
    public static String chlevel = "學校類型";
    public static String entel = "Telephone";
    public static String chtel = "聯絡電話";
    public static String enfax = "Fax Number";
    public static String chfax = "傳真號碼";
    public static String enweb = "WebSite";
    public static String chweb = "網頁";
    public static String enreligion = "Religion";
    public static String chreligion = "宗教";


    public static ArrayList<HashMap<String, String>> eninfoList = new ArrayList<>();
    public static ArrayList<HashMap<String, String>> chinfoList = new ArrayList<>();
    // Creates and add contact to contact list
    public static void enaddContact(String id, String cat, String name, String address, String gender, String session, String district, String fintype, String level, String tele, String fax, String website, String religion) {

        HashMap<String, String> info = new HashMap<>();
        info.put(schoolid, id);
        info.put(encat, cat);
        info.put(enname, name);
        info.put(enaddress, address);
        info.put(engender, gender);
        info.put(ensession, session);
        info.put(endistrict, district);
        info.put(enfintype, fintype);
        info.put(enlevel, level);
        info.put(entel, tele);
        info.put(enfax, fax);
        info.put(enweb, website);
        info.put(enreligion, religion);

        eninfoList.add(info);
    }
    public static void chaddContact(String id, String cat, String name, String address, String gender, String session, String district, String fintype, String level, String tele, String fax, String website, String religion) {

        HashMap<String, String> info = new HashMap<>();
        info.put(schoolid,id);
        info.put(chcat, cat);
        info.put(chname, name);
        info.put(chaddress, address);
        info.put(chgender, gender);
        info.put(chsession, session);
        info.put(chdistrict, district);
        info.put(chfintype, fintype);
        info.put(chlevel, level);
        info.put(chtel, tele);
        info.put(chfax, fax);
        info.put(chweb, website);
        info.put(chreligion, religion);

        chinfoList.add(info);
    }
}
