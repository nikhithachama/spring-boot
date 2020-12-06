<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <style>
        body, title {
            background-color: azure;
        }

        table {
            border-collapse: collapse;
        }

        caption {
            font-size: 30px;
        }

        th {
            background-color: #4CAF50;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        th, td {
            padding: 15px;
            text-align: left;
        }
    </style>
    <title>List of Registered Students list</title>
</head>
<body>
<div align="center">
    <table border="1" class="table table-striped">
        <caption>Students list</caption>
        <tr>
            <th>Id</th>
            <th> Student Name</th>
            <th>RollNo</th>
            <th>Gender</th>
            <th>Age</th>
            <th>School</th>
            <th>Class Code</th>
            <th>Class</th>
        </tr>
        <c:forEach items="${listOfStudents}" var="student">
            <tr>
                <td>${student.sid}</td>
                <td>${student.sname}</td>
                <td>${student.rollno}</td>
                <td>${student.gender}</td>
                <td>${student.dob}</td>
                <td>${student.school}</td>
                <td>${className.classCode}</td>
                <td>${className.name}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>