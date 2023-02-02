package objectOrientedProgramming;

public interface Logger {
	
	public void Log(StringBuilder str);
	public void error(StringBuilder str);
	
}

class AsteriskLogger implements Logger {

	@Override
	public void Log(StringBuilder str) {
		// TODO Auto-generated method stub

		System.out.println(astrickWord(str));
		
	}

	@Override
	public void error(StringBuilder str) {
		// TODO Auto-generated method stub
		StringBuilder newStr = new StringBuilder(str);
		StringBuilder astLine = new StringBuilder();
		
		newStr = astrickWord(newStr.insert(0, "ERROR: "));
		astLine.append(astrickLine(newStr));
		
		System.out.println(astLine + "\n" + newStr + "\n" + astLine);
		
	}
	
	private StringBuilder astrickLine(StringBuilder str) {
		StringBuilder askStr = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++) {
			askStr.append('*');
		}
		
		return askStr;
	}
	
	private StringBuilder astrickWord(StringBuilder str) {
		StringBuilder newStr = new StringBuilder("***" + str + "***");
		
		return newStr;
	}
	
}

class SpacedLogger implements Logger {

	@Override
	public void Log(StringBuilder str) {
		// TODO Auto-generated method stub
		StringBuilder newStr = new StringBuilder(spaceWord(str));
		
		System.out.println(newStr);
	}

	@Override
	public void error(StringBuilder str) {
		// TODO Auto-generated method stub
		System.out.println("ERROR:" + spaceWord(str));
	}
	
	private StringBuilder spaceWord(StringBuilder str) {
		StringBuilder newStr = new StringBuilder(str);
		
		if(str.length() > 2) {
			
			for(int i = str.length() - 1; i >= 0; i-- ) {
				
				newStr.insert(i, ' ');
				
			}
			
		}
		
		return newStr;
	}
}