# CustomerDetails_WithoutMaven
Built the project without using Maven

This is a mule Application which exposes a rest API to perform following operations :

	Page though the list of customers using offset and limit as query parameters 	search customers by post code 
	search customer by customer ID

	While designing RAML, I have used some best practises and used Libraries, traits and Data types. 
I have used H2 as in Memory Database 	The implementations also uses Cache scope to improve performance.
	Caching can be disabled by passing a query parameter bypasscache=true

This mule project is built without using maven. so, it will not manage its dependencies.Manually we need to add jar files 
which are needed, So attched the same.

Unit testing:

All the scenarios which are require to cover the usecase are covered and the screen shots of the results were taken and attached in the
github.


MUnit tests are also included.
