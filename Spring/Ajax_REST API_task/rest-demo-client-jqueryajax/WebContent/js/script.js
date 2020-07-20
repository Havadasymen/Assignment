$(document).ready(function() {
	
	console.log("jQuery loaded!");
	$.ajax({
		url: "http://localhost:8080/rest-demo/rest/products/create",
		type: "POST",
		data: JSON.stringify({
			"id": 1,
			"name": "iPad Mini 32GB",
			"price": 192.99
		}),
		dataType: "json",
		contentType: "application/json; charset=utf-8",
		success: (data) => {
			console.log("Success: " + data);
			$("#response").text("Response from server: " + data);
		}
	});
	
	
})