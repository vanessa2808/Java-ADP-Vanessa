package homeWork;
/**
 * @author Vanessa
 */
/*
 * (1) definition of subString and fullString:
         => Given 100101   
            Substring is 100, and fullString is 100101
         => Given 11010
            Substring is 10, fullString is 101

    (2) if required fullstring's length is n, and string to include is "101" then substring's length is n-3;

    (3) we can make 2^n substring that have length = n.
        EX: if length per substring is 2, then we have : 00,10,11,01 (2^2 substring).

    (4) if substring length = n, then we can have n+1 fullString made from substring, by insert "101"
        Ex: substring is 0 (length=1) then we have two fulString like 1010, 0101.
            substring is 10 (length=2) then we have three fullString like 10110,11010,10101

    (5) if we have N substring, each substring's length is n, then we have (n+1)*N fullString.
        EX: we have N = 2 subString 0,1 (length n=1). then we have 1010,0101,1011,1101 ((1+n)*N=4 fullString).
 */

public class BitString {
	private int lengthPerSubString;
	private String[] subStringArray;
	private String[] fullStringArray;
	private int numberOfSubString;
	private int numberOfFullString;
	private int postion = 0;
	private int postion2 = 0;
	/*
	 * @param: create the bit String
	 */
	public BitString(int lengthPerString, String toIncludeString) {
		// read (2) above
		this.lengthPerSubString = lengthPerString-toIncludeString.length();
		// read (3) 
		this.numberOfSubString = (int) Math.pow(2, this.lengthPerSubString);
		// read (4)
		this.numberOfFullString = numberOfSubString*(this.lengthPerSubString+1);
		// init substringarray 
		subStringArray = new String[this.numberOfSubString];
		// init fullstringarray
		fullStringArray = new String[this.numberOfFullString];
		// make all substring with given length and store it in substring array
		makePart(this.lengthPerSubString, new String());   
		// from substringarray, make fullstringarray by insert "101" to each substring
		makeFull(toIncludeString);
		// sort fullstringarray 
		this.fullStringArray = sort(this.fullStringArray);
	}
	// function to add made substring to substringarray
	private void addStringToSubStringArray(String str) {
		subStringArray[postion++] = str; 
	}
	// like addStringtosubstringArray function, but for FullString
	private void addStringToFullStringArray(String str) {
		fullStringArray[postion2++] = str;
	}

	// make all SubString with length = len.
	// read recursive function to understand.
	private void makePart(int len, String str) {
		if (len > 0) {
			makePart(len - 1, str + "0");
			makePart(len - 1, str + "1");

		} else {
			addStringToSubStringArray(str);
		}
	}
	// make all fullString by insert str ("101") to each substring stored in subStringArray and then store them in fullStringarray 
	private void makeFull(String str){

		for (int i =0; i<this.numberOfSubString;i++){

			String string = subStringArray[i];
			for (int j = this.lengthPerSubString-1;j>=-1;j--){
				// if insert at the first position of substring
				// ex: substring is "0000" then insert fullString is "1010000"
				if (j==-1){
					addStringToFullStringArray(str+string);
					continue;
				}
				//split string into 2 part, (tail and head), fullString = head+"101"+tail
				//ex: substring = 1000, if we insert "101" between 0,1 then : head = "1", tail ="0000", fulString = "1"+"101"+"0000"
				String head ="";
				for (int k = 0; k<=j ;k++){
					head = head + string.charAt(k);
				}
				String tail = "";
				for (int k=j+1;k<this.lengthPerSubString;k++){
					tail = tail+ string.charAt(k);
				}
				//store fullString to Array
				addStringToFullStringArray(head+str+tail);
			}
		}
	}
	private String[] sort(String[] strs){
		int count=1;
		for (int i = 0; i< strs.length-1;i++){
			int iMin = i;
			for (int j=i+1;j<strs.length;j++){    
				if (strs[iMin].compareTo(strs[j])>0){
					iMin = j;
				}
			}
			String temp = strs[i];
			strs[i] = strs[iMin];
			strs[iMin] = temp;
			count=count+1;
		}
		System.out.println("The number of strings contain 101 and follow the dictionary: "+count);
		return strs;
	}
	public String getGeneratedString(){
		String temp = "";
		for (int i = 0; i< fullStringArray.length;i++){
			// if string at position i and position i-1 is the same then ignore it.
			if (i>0 && fullStringArray[i]==fullStringArray[i-1]){
				continue;
			}
			if (temp==""){
				temp = fullStringArray[i];
			}else{
				temp = temp +", "+fullStringArray[i];
			}
		}
		return temp;
	}
}