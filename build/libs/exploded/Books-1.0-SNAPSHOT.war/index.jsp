<html lang="en">
<head>
    <meta name="google-signin-scope" content="profile email">
    <meta name="google-signin-client_id" content="299339477600-t8pnbjaulsupvjmj55e87oco4kibujdc.apps.googleusercontent.com">
    <script src="https://apis.google.com/js/platform.js" async defer></script>

</head>
<body>
<div class="g-signin2" data-onsuccess="onSignIn" data-theme="dark"></div>
<script>
    function onSignIn(googleUser) {
        // Useful data for your client-side scripts:
        var profile = googleUser.getBasicProfile();
        console.log("ID: " + profile.getId()); // Don't send this directly to your server!
        console.log('Full Name: ' + profile.getName());
        console.log('Given Name: ' + profile.getGivenName());
        console.log('Family Name: ' + profile.getFamilyName());
        console.log("Image URL: " + profile.getImageUrl());
        console.log("Email: " + profile.getEmail());

        // The ID token you need to pass to your backend:
        var id_token = googleUser.getAuthResponse().id_token;
        console.log("ID Token: " + id_token);
    };
</script>
</body>
</html>

<%--declare const gapi: any;--%>
<%--public auth2: any;--%>
<%--public googleInit() {--%>
<%--gapi.load('auth2', () => {--%>
<%--this.auth2 = gapi.auth2.init({--%>
<%--client_id: 'YOUR_CLIENT_ID.apps.googleusercontent.com',--%>
<%--cookiepolicy: 'single_host_origin',--%>
<%--scope: 'profile email'--%>
<%--});--%>
<%--this.attachSignin(document.getElementById('googleBtn'));--%>
<%--});--%>
<%--}--%>
<%--public attachSignin(element) {--%>
<%--this.auth2.attachClickHandler(element, {},--%>
<%--(googleUser) => {--%>

<%--let profile = googleUser.getBasicProfile();--%>
<%--console.log('Token || ' + googleUser.getAuthResponse().id_token);--%>
<%--console.log('ID: ' + profile.getId());--%>
<%--console.log('Name: ' + profile.getName());--%>
<%--console.log('Image URL: ' + profile.getImageUrl());--%>
<%--console.log('Email: ' + profile.getEmail());--%>
<%--//YOUR CODE HERE--%>


<%--}, (error) => {--%>
<%--alert(JSON.stringify(error, undefined, 2));--%>
<%--});--%>
<%--}--%>

<%--ngAfterViewInit(){--%>
<%--this.googleInit();--%>
<%--}--%>