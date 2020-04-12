# Ecommerce

Ecommerce made of three microservices :-

- Aggregator Service

	Consume user and order service and aggregate the result.

- User Service

	Api to get the user details.

- Order Service

	Api to get the order details.

Also has yamls files can be to deploy on Google Kubenetes Engine :- 

	- Jaeger Tracing is used to trace aggregator, user and order servcie.

	- MySql is used as the backed to store user and order data and aggregated to User and order service


Steps to Deploy application on Google Kubenetes Engine :- 

	- Create Google Kubernetes Cluster.

	- Upload all yaml files on Google Cloud Shell with shell script "ecommerce-application.sh".

	- Now use Shell script "ecommerce-application.sh" to deploy application on Kubernetes using command :-
	  
		1. Give permission to shell script file.
		  
			Chmod +x ecommerce-application.sh 

		2. Run Command

			./ecommerce-application.sh
