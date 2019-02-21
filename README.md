# FunnyAnimal

SingTel assignment

Can you design a RESTful API for querying these animals?

Syntax       	    /animal/<animalName>
HTTP Method 	    GET
Function    	    query animal capbilities
Authorization 	  none
Request Headers 	Accept: application/json
Request Body 	    none
Response Status 	200
Response Headers 	Content-Type: application/json
Response Body 	  [
                    "flyable", "swimable"
                  ]
                  
Error Response
Response Status 	400
Response Body 	  {
                    "error", "Animal can't be found"
                  }


