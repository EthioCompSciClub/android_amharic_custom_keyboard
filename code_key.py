def convert_code():
	for i in ('0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'):
		x = "120" + str(i)
		print("<item name=\"\"> "+ str(int(x,16)) + " </item>  <!--" + x + "--->")


if __name__ == "__main__":
    convert_code()	




