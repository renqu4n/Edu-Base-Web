package com.hk.tools;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.util.JSONUtils;

import org.apache.commons.beanutils.BeanUtils;
public class Json
{
/**
* 
* @author wangwei JSON������
* @param <T>
* 
*/
 
/***
* ��List�������л�ΪJSON�ı�
*/
public static <T> String toJSONString(List<T> list)
{
JSONArray jsonArray = JSONArray.fromObject(list);
return jsonArray.toString();
}
 
/***
* ���������л�ΪJSON�ı�
* @param object
* @return
*/
public static String toJSONString(Object object)
{
JSONArray jsonArray = JSONArray.fromObject(object);
return jsonArray.toString();
}
/***
* ��JSON�����������л�ΪJSON�ı�
* @param jsonArray
* @return
*/
public static String toJSONString(JSONArray jsonArray)
{
return jsonArray.toString();
}
/***
* ��JSON�������л�ΪJSON�ı�
* @param jsonObject
* @return
*/
public static String toJSONString(JSONObject jsonObject)
{
return jsonObject.toString();
} 
 
/***
* ������ת��ΪList����
* @param object
* @return
*/
public static List toArrayList(Object object)
{
List arrayList = new ArrayList();
JSONArray jsonArray = JSONArray.fromObject(object);
Iterator it = jsonArray.iterator();
while (it.hasNext())
{
JSONObject jsonObject = (JSONObject) it.next();
Iterator keys = jsonObject.keys();
while (keys.hasNext())
{
Object key = keys.next();
Object value = jsonObject.get(key);
arrayList.add(value);
}
}
return arrayList;
}
/***
* ������ת��ΪCollection����
* @param object
* @return
*/
/*public static Collection toCollection(Object object)
{
JSONArray jsonArray = JSONArray.fromObject(object);
return JSONArray.toCollection(jsonArray);
}*/
/***
* ������ת��ΪJSON��������
* @param object
* @return
*/
public static JSONArray toJSONArray(Object object)
{
return JSONArray.fromObject(object);
}
/***
* ������ת��ΪJSON����
* @param object
* @return
*/
public static JSONObject toJSONObject(Object object)
{
return JSONObject.fromObject(object);
}
/***
* ������ת��ΪHashMap
* @param object
* @return
*/
public static HashMap toHashMap(Object object)
{
HashMap<String, Object> data = new HashMap<String, Object>();
JSONObject jsonObject = Json.toJSONObject(object);
Iterator it = jsonObject.keys();
while (it.hasNext())
{
String key = String.valueOf(it.next());
Object value = jsonObject.get(key);
data.put(key, value);
}
return data;
}
/***
* ������ת��ΪList<Map<String,Object>>
* @param object
* @return
*/
// ���ط�ʵ������(Map<String,Object>)��List
public static List<Map<String, Object>> toList(Object object)
{
List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
JSONArray jsonArray = JSONArray.fromObject(object);
for (Object obj : jsonArray)
{
JSONObject jsonObject = (JSONObject) obj;
Map<String, Object> map = new HashMap<String, Object>();
Iterator it = jsonObject.keys();
while (it.hasNext())
{
String key = (String) it.next();
Object value = jsonObject.get(key);
map.put((String) key, value);
}
list.add(map);
}
return list;
}
/***
* ��JSON��������ת��Ϊ�������͵�List
* @param <T>
* @param jsonArray
* @param objectClass
* @return
*/
public static <T> List<T> toList(JSONArray jsonArray, Class<T> objectClass)
{
return JSONArray.toList(jsonArray, objectClass);
}
/***
* ������ת��Ϊ�������͵�List
* @param <T>
* @param jsonArray
* @param objectClass
* @return
*/
public static <T> List<T> toList(Object object, Class<T> objectClass)
{
JSONArray jsonArray = JSONArray.fromObject(object);
return JSONArray.toList(jsonArray, objectClass);
}
/***
* ��JSON����ת��Ϊ�������͵Ķ���
* @param <T>
* @param jsonObject
* @param beanClass
* @return
*/
public static <T> T toBean(JSONObject jsonObject, Class<T> beanClass)
{
return (T) JSONObject.toBean(jsonObject, beanClass);
}
/***
* ��������ת��Ϊ�������͵Ķ���
* @param <T>
* @param object
* @param beanClass
* @return
*/
public static <T> T toBean(Object object, Class<T> beanClass)
{
JSONObject jsonObject = JSONObject.fromObject(object);
return (T) JSONObject.toBean(jsonObject, beanClass);
}
/***
* ��JSON�ı������л�Ϊ���ӹ�ϵ��ʵ��
* @param <T> ����T �����ʵ������
* @param <D> ����D ����ʵ������
* @param jsonString JSON�ı�
* @param mainClass ��ʵ������
* @param detailName ��ʵ��������ʵ�����е��������
* @param detailClass ��ʵ������
* @return
*/
public static <T, D> T toBean(String jsonString, Class<T> mainClass,
String detailName, Class<D> detailClass)
{
JSONObject jsonObject = JSONObject.fromObject(jsonString);
JSONArray jsonArray = (JSONArray) jsonObject.get(detailName);
T mainEntity = Json.toBean(jsonObject, mainClass);
List<D> detailList = Json.toList(jsonArray, detailClass);
try
{
BeanUtils.setProperty(mainEntity, detailName, detailList);
}
catch (Exception ex)
{
throw new RuntimeException("���ӹ�ϵJSON�����л�ʵ��ʧ�ܣ�");
}
return mainEntity;
}
/***
* ��JSON�ı������л�Ϊ���ӹ�ϵ��ʵ��
* @param <T>����T �����ʵ������
* @param <D1>����D1 ����ʵ������
* @param <D2>����D2 ����ʵ������
* @param jsonString JSON�ı�
* @param mainClass ��ʵ������
* @param detailName1 ��ʵ��������ʵ�����е�����
* @param detailClass1 ��ʵ������
* @param detailName2 ��ʵ��������ʵ�����е�����
* @param detailClass2 ��ʵ������
* @return
*/
public static <T, D1, D2> T toBean(String jsonString, Class<T> mainClass,
String detailName1, Class<D1> detailClass1, String detailName2,
Class<D2> detailClass2)
{
JSONObject jsonObject = JSONObject.fromObject(jsonString);
JSONArray jsonArray1 = (JSONArray) jsonObject.get(detailName1);
JSONArray jsonArray2 = (JSONArray) jsonObject.get(detailName2);
T mainEntity = Json.toBean(jsonObject, mainClass);
List<D1> detailList1 = Json.toList(jsonArray1, detailClass1);
List<D2> detailList2 = Json.toList(jsonArray2, detailClass2);
try
{
BeanUtils.setProperty(mainEntity, detailName1, detailList1);
BeanUtils.setProperty(mainEntity, detailName2, detailList2);
}
catch (Exception ex)
{
throw new RuntimeException("���ӹ�ϵJSON�����л�ʵ��ʧ�ܣ�");
}
return mainEntity;
}
 
/***
* ��JSON�ı������л�Ϊ���ӹ�ϵ��ʵ��
* @param <T>����T �����ʵ������
* @param <D1>����D1 ����ʵ������
* @param <D2>����D2 ����ʵ������
* @param jsonString JSON�ı�
* @param mainClass ��ʵ������
* @param detailName1 ��ʵ��������ʵ�����е�����
* @param detailClass1 ��ʵ������
* @param detailName2 ��ʵ��������ʵ�����е�����
* @param detailClass2 ��ʵ������
* @param detailName3 ��ʵ��������ʵ�����е�����
* @param detailClass3 ��ʵ������
* @return
*/
public static <T, D1, D2, D3> T toBean(String jsonString,
Class<T> mainClass, String detailName1, Class<D1> detailClass1,
String detailName2, Class<D2> detailClass2, String detailName3,
Class<D3> detailClass3)
{
JSONObject jsonObject = JSONObject.fromObject(jsonString);
JSONArray jsonArray1 = (JSONArray) jsonObject.get(detailName1);
JSONArray jsonArray2 = (JSONArray) jsonObject.get(detailName2);
JSONArray jsonArray3 = (JSONArray) jsonObject.get(detailName3);
T mainEntity = Json.toBean(jsonObject, mainClass);
List<D1> detailList1 = Json.toList(jsonArray1, detailClass1);
List<D2> detailList2 = Json.toList(jsonArray2, detailClass2);
List<D3> detailList3 = Json.toList(jsonArray3, detailClass3);
try
{
BeanUtils.setProperty(mainEntity, detailName1, detailList1);
BeanUtils.setProperty(mainEntity, detailName2, detailList2);
BeanUtils.setProperty(mainEntity, detailName3, detailList3);
}
catch (Exception ex)
{
throw new RuntimeException("���ӹ�ϵJSON�����л�ʵ��ʧ�ܣ�");
}
return mainEntity;
}
/***
* ��JSON�ı������л�Ϊ���ӹ�ϵ��ʵ��
* @param <T> ��ʵ������
* @param jsonString JSON�ı�
* @param mainClass ��ʵ������
* @param detailClass ����˶����ʵ������ʵ����������ƺ�����
* @return
*/
public static <T> T toBean(String jsonString, Class<T> mainClass,
HashMap<String, Class> detailClass)
{
JSONObject jsonObject = JSONObject.fromObject(jsonString);
T mainEntity = Json.toBean(jsonObject, mainClass);
for (Object key : detailClass.keySet())
{
try
{
Class value = (Class) detailClass.get(key);
BeanUtils.setProperty(mainEntity, key.toString(), value);
}
catch (Exception ex)
{
throw new RuntimeException("���ӹ�ϵJSON�����л�ʵ��ʧ�ܣ�");
}
}
return mainEntity;
}
/**
* ��װjson��ݴӺ�̨����
* @param obj
*/
/*public static void outPutJson(Object obj){
ActionContext context = ActionContext.getContext();
HttpServletResponse response = (HttpServletResponse) context.get(ServletActionContext.HTTP_RESPONSE);
try {
response.getWriter().print(obj);
} catch (IOException e) {
e.printStackTrace();
}
}*/

}
//������

 








