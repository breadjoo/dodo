<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>�Խ���</title>
<script type="text/javascript">
function check() {
	if(Write.name.value.length<1){
		alert("�ۼ��ڸ� �Է��ϼ���.");
		Write.name.focus();
		return false;
	}
	if(Write.pass.value.length <1) {
		alert("��й�ȣ�� �Է��ϼ���.");
		Write.pass.focus();
		return false;
	}
	if(Write.email.value.indexOf("@")+""=="-1" ||
		Write.email.value.indexOf(".")+""=="-1" ||
		Write.email.value =="") {
			alert("e-mail�� �Է��ϼ���.");
			Write.email.focus();
			return false;
		}
	if(Write.title.value.length <1) {
		alert("�������� �Է��ϼ���.");
		Write.title.focus();
		return false;
	}
	if(Write.contents.value.length <1) {
		alert("�� ������ �Է��ϼ���.");
		Write.contents.focus()
		return false;
	}
	Write.submit();
}
</script>
</head>
<body>

<center><font size="3"><b>�Խ��� �۾���</b></font></center>
<table border="0" width="600" cellpadding="0" cellspacing="0">
	<tr>
		<td><hr size="1" noshade></td>
	</tr>
</table>
<form action="write_input.jsp" name="Write" method="post" onsubmit="return check()">
<table border="0" width="600" cellpadding"2" cellspacing="2">
	<tr>
		<td width="100" bgcolor="cccccc">
			<font size="2"><center><B>�ۼ���</B></center></font></td>
		<Td>
			<p><input type="text" size="12" name="name"></p>
		</Td>
	</tr>
	<tr>
		<td width="100" bgcolor="cccccc">
			<font size="2"><center><b>��й�ȣ</b></center></font></td>
		<td>
			<p><input type="password" size="12" name="pass">
						*�ʼ�(�Խù� ���� ������ �ʿ��մϴ�.)</p>
		</td>
	</tr>
	<tr>
		<td width="100" bgcolor="cccccc">
			<font size="2"><center><b>e-mail</b></center></font></td>
		<td>
			<font size="2"><input type="text" size="40" maxlength="50" name="email"></font>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<hr size="1" noshade>
		</td>
	</tr>
	<tr>
		<td width="100" bgcolor="cccccc">
			<font size="2"><center><b>�� ����</b></center></font></td>
		<td>
			<font size="2"><input type="text" size="70" maxlength="50" name="title"></font>
		</td>
	</tr>

	<tr>
		<td bgcolor="cccccc">
			<font size="2"><center><b>�� ����</b></center></font></td>
		<td>
			<font size="2">
			<textarea cols="70" rows="15" wrap="virtual" name="contents"></textarea></font>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<hr size="1" noshade>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<hr size="1" noshade>
		</td>
	</tr>
	<tr>
		<td align="center" colspan="2" width="100%">
			<table>
				<tr>
					<td width="100" align="center">
						<input type = "reset" value = "�ٽ� �ۼ�">
					</td>
					<td width="200" align="center">
						<input type = "submit" value="���">	
			</table>
	</tr>
	
</table>

</form>

</body>
</html>