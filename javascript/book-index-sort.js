var array = ["1", "1.2", "2"];

array.sort(function (string2, string1) {
	var stringArray1 = string1.split(".");
	var stringArray2 = string2.split(".");
	var equalCount = 0;
	for (var i = 0; i < stringArray1.length; i++) {
		if (stringArray1[i] && stringArray2[i]) {
			if (parseInt(stringArray1[i]) > parseInt(stringArray2[i])) {
				return -1;
			} else if (stringArray1[i] == stringArray2[i]) {
				equalCount++;
			} else {
				return 1;
			}
		}
		else {
			return (equalCount > 0 && stringArray1.length < stringArray2.length)
				? -1 : 1;
		}
	}
});
document.write(array.join("<br/>"));
