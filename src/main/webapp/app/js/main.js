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

});
