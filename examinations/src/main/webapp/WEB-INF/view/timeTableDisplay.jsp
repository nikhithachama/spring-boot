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
    <title>Examination Schedule</title>
</head>
<body>
<div align="center">
    <table border="1" class="table table-striped">
        <caption>TimeTable for ${timeTable.name} </caption>
        <tr>
            <th>Exam Type</th>
            <th>Subject</th>
            <th>Date</th>
            <th>Start Time</th>
            <th>End Time</th>

        </tr>

            <tr>
<%--                <c:forEach items="${listOfTables}" var="timeTable">--%>
                <td >${timeTable.examType}</td>
                    <td>${timeTable.subjectName}</td>
<%--                <c:forEach items="${listOfSubjects}" var="subject">--%>
<%--&lt;%&ndash;                <td>${subject.subjectName}</td>&ndash;%&gt;--%>
<%--                    <td><% String[] items = request.getParameterValues("subjectName");--%>
<%--                        for(int i = 0; i < items.length; i++){--%>
<%--                            out.println(items[i] + "<BR>");--%>
<%--                        }--%>
<%--                    %></td>--%>
<%--                </c:forEach>--%>
                <td>${timeTable.examDate}</td>
                <td>09:00 AM</td>
                <td>12:00 PM</td>
<%--                </c:forEach>--%>
            </tr>
    </table>
</div>
</body>
</html>