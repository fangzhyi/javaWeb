<%@ page import="com.pojo.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 2021/5/2
  Time: 13:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <%
      Person person = new Person();
      person.setName("joker");
      person.setPhones(new String[]{"4321432143243","432321324324","5676768888768"});
      List<String> cities = new ArrayList<>();
      cities.add("北京");
      cities.add("南京");
      cities.add("西京");
      cities.add("东京");
      person.setCities(cities);
      Map<String, Object> map = new HashMap<>();
      map.put("key1","value1");
      map.put("key2","value2");
      map.put("key3","value3");
      person.setMap(map);

      pageContext.setAttribute("person",person);
  %>

    输出Preson：${person}<br>
    输出Preson的name属性：${person.name}<br>
    输出Preson的phones数组属性值：${person.phones[1]}<br>
    输出Preson的cities集合属性值：${person.cities}<br>
    输出Preson的cities集合某一个属性值：${person.cities[2]}<br>
    输出Preson的map集合属性值：${person.map}<br>
    输出Preson的map集合某一个属性值：${person.map.key1}<br>

</body>
</html>
