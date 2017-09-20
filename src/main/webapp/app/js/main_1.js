$(document).ready(function () {

	var access_token;

	var jso = new JSO({
		providerID: "SkIDentity",
		client_id: "verimi-hackathon",
		redirect_uri: "https://dev.skidentity.de/verimi-hackathon-fe/loggedin",
		authorization: "https://dev.skidentity.de/verimi-hackathon-sp/api/oauth/authorize",
		scopes: "auth"
	});

	jso.callback();

	$('#loginBtn').click(function () {
		console.log("Retrieve OAuth Token...");
		jso.getToken(function (token) {
			access_token = token;
			console.log("Token: ", access_token);
		});
	});

	$('#buyBtn').click(function () {
		console.log("Buy Button.");
	});

	$('#creditBtn').click(function () {
		console.log("Credit Button.");
	});

	$('#continueBtn').click(function () {
		console.log("Continue Button.");
	});

	$('#cancelBtn').click(function () {
		console.log("Cancel Button.");
	});

	$('#downloadBtn').click(function() {
		console.log("Download Button.");
	});

	$('#loginBtn').click(function() {
		console.log("Login Button.");
	});

	$('#acceptBtn').click(function() {
		console.log("Accept Button.");
	});

});
