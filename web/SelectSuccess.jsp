<%--
  Created by IntelliJ IDEA.
  User: 11842
  Date: 2020/11/24
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Select</title>
    <style>
        body {
            width: 100%;
            height: 516px;
            background: url(pictures/picture.jpg) no-repeat;
            background-size: cover;
            display: block;
            margin: 0 auto;
            box-sizing: border-box;
            overflow-x: hidden;
        }

        div {
            width: 300px;
            padding: 40px;
            position: absolute; /* 绝对定位，相对于父标签来进行定位 */
            top: 50%;
            right: 10%;
            transform: translate(-50%, -50%);
            text-align: center; /*表单中内容居中*/
        }

        .table {
            width: 300px;
            padding: 40px;
            position: absolute; /* 绝对定位，相对于父标签来进行定位 */
            top: 50%;
            left: 20%;
            transform: translate(-50%, -50%);
            background: #191919;
            text-align: center; /*表单中内容居中*/
        }

        .table h1 {
            color: white; /* 设置字体颜色 */
            text-transform: uppercase; /* 将字体全部设置成大写字母  */
            font-weight: 500; /*  设置字体粗细   */
        }

        label {
            color: white;
        }

        .table input[type="text"] {
            border-radius: 10px;
            border: 2px solid #3498db;
            background: none;
            display: block;
            margin: 20px auto;
            text-align: center;
            padding: 14px 10px;
            width: 200px;
            outline: none;
            color: white;
            transition: 0.25s;
        }

        .table input[type="text"]:focus, .table input[type="password"]:focus {
            width: 280px;
            border-color: #2ecc71;
        }

        .table input[type="submit"], .table input[type="reset"] {
            border-radius: 24px;
            border: 2px solid #2ecc71;
            background: none;
            display: block;
            margin: 20px auto;
            text-align: center;
            padding: 14px 40px;
            outline: none;
            color: white; /* 设置输入框中竖线的颜色 */
            transition: 0.25s;
            cursor: pointer;
        }

        .table input[type="submit"]:hover, .table input[type="reset"]:hover {
            background: #2ecc71;
        }

        textarea {
            display: block;
            overflow: auto;
            font-size: 25px;
        }
    </style>
</head>
<body>
<form class="table" action="select" method="get">
    <h1>select</h1>
    <label><input type="text" name="ID" placeholder="请输入您要查询的学号" /></label>
    <input type = "submit" value="提交" />
    <input type = "reset" value="重置" />
</form>
<div><textarea cols="50" rows="25" readonly>${s}</textarea></div>
</body>
</html>
