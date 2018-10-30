import requests
import datetime
import json

dataArray = {"key" : "value"};

filename = datetime.datetime.now().strftime ("%Y%m%d") +".txt"
file = open(filename, 'w+')
i=0
url = ""
while(i<100):
	i=i+1
	response = requests.post(url, json=dataArray)
	file.write("Request Param:::::::::")
	file.write("\n")
	file.write(json.dumps(dataArray))
	file.write("\n")
	file.write("Response :::::::::")
	file.write("\n")	
	file.write("Status code::::"+str(response.status_code))
	file.write("\n")	
	file.write("Response Body::::"+response.content)
	file.write("\n")
	file.write("\n")
