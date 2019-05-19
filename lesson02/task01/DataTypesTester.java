public class DataTypesTester{
	public static void testByte(){
		byte a = 1, b = 2, c;
		System.out.println("\n ***** Arithmetical Operators *****");

		//addition
		c = (byte)(a + b); 
		System.out.printf("%d + %d = %d\n", a, b, c);

		//subtraction
		c = (byte)(a - b); 
		System.out.printf("%d - %d = %d\n", a, b, c);

		//multiplication
		c = (byte)(a * b); 
		System.out.printf("%d * %d = %d\n", a, b, c);

		//division
		c = (byte)(a / b); 
		System.out.printf("%d / %d = %d\n", a, b, c);
		// c = (byte)(a / 0); --> Arithmetical Exception

		//modulus
		c = (byte)(a % b);
		System.out.printf("%d %% %d = %d\n", a, b, c);
		// c = (byte)(a % 0); --> Arithmetical Exception

		a = 5;

		//unary minus
		c = (byte)(-a); 
		System.out.printf("-%d = %d\n", a, c);

		//unary plus
		c = (byte)(+a); 
		System.out.printf("+%d = %d\n", a, c);

		//prefix increment
		a = 5;
		System.out.printf("++%d = %d\n", a, (byte)(++a)); 

		//postfix increment
		a = 5;
		System.out.printf("%d++ = %d\n", a, (byte)(a++));

		//prefix decrement
		a = 5;
		System.out.printf("--%d = %d\n", a, (byte)(--a)); 

		//postfix decrement
		a = 5;
		System.out.printf("%d-- = %d\n", a, (byte)(a--));  

		System.out.println("\n***** Bitwise Operators *****");
		
		//bitwise AND
		c = (byte)(a & b); 
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		//bitwise OR
		c = (byte)(a | b); 
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		//bitwice XOR
		c = (byte)(a ^ b); 
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		//bitwice unary compliment
		c = (byte)(~a); 
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		//left shift
		c = (byte)(a << 1); 
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		//right shift
		c = (byte)(a >> 1); 
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		//right shift
		a = -5;
		c = (byte)(a >> 1); 
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		// zero fill right shift
		a = 5;
		c = (byte)(a >>> 1); 
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		// zero fill right shift
		a = -5;
		c = (byte)(a >>> 1); 
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		
		System.out.println("\n***** Assignment Operators *****");
		
		c = 7;
		
		//assignment arithmetical operators
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		// c /= 0; --> Arithmetical Exception
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
		// c %= 0; --> Arithmetical Exception

		//assignment bitwise operators
		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
		
		System.out.println("\n***** Relational Operators *****");
		
		// greater than
		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		// equal to
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%d != %d --> %b\n", a, b, a != b);
		
		System.out.println("\n***** Logical Operations *****");
		
		// logical AND
		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
		// bitwise logical AND
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
		// logical OR
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
		// bitwise logical OR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
		// logical XOR
		System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
		// logical NOT
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
		
		System.out.println("\n***** Misc Operators *****");
		
		System.out.println("\nCondition Operator:");
		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));
		
		System.out.println("\nType Cast Operator:");
		short sh = -32000;
		int in = 125000;
		char ch = '\u0033';
		long l = 100000000000000000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;
		
		//cast short to byte
		c = (byte)sh;
		System.out.printf("byte = short: c = (byte)%d --> c = %d\n", sh, c);

		//cast int to byte
		c = (byte)in;
		System.out.printf("byte = int: c = (byte)%d --> c = %d\n", in, c);
		
		//cast char to byte
		c = (byte)ch;
		System.out.printf("byte = char: c = (byte)'%c' --> c = %d\n", ch, c);
		
		//cast long to byte
		c = (byte)l;
		System.out.printf("byte = long: c = (byte)%d --> c = %d\n", l, c);

		//cast float to byte
		c = (byte)f;
		System.out.printf("byte = float: c = (byte)%f --> c = %d\n", f, c);
		
		//cast double to byte
		c = (byte)d;
		System.out.printf("byte = double: c = (byte)%f --> c = %d\n", d, c);

		//cast bollean to byte
		System.out.printf("byte = boolean: c = (byte)%b --> Compile Error\n", bool);
	}

	public static void testShort(){
		short a = 1, b = 2, c;
		System.out.println("\n ***** Arithmetical Operators *****");

		//addition
		c = (short)(a + b); 
		System.out.printf("%d + %d = %d\n", a, b, c);

		//subtraction
		c = (short)(a - b); 
		System.out.printf("%d - %d = %d\n", a, b, c);

		//multiplication
		c = (short)(a * b); 
		System.out.printf("%d * %d = %d\n", a, b, c);

		//division
		c = (short)(a / b); 
		System.out.printf("%d / %d = %d\n", a, b, c);
		// c = (short)(a / 0); --> Arithmetical Exception

		//modulus
		c = (short)(a % b);
		System.out.printf("%d %% %d = %d\n", a, b, c);
		// c = (short)(a % 0); --> Arithmetical Exception

		a = 5;

		//unary minus
		c = (short)(-a); 
		System.out.printf("-%d = %d\n", a, c);

		//unary plus
		c = (short)(+a); 
		System.out.printf("+%d = %d\n", a, c);

		//prefix increment
		a = 5;
		System.out.printf("++%d = %d\n", a, (short)(++a)); 

		//postfix increment
		a = 5;
		System.out.printf("%d++ = %d\n", a, (short)(a++));

		//prefix decrement
		a = 5;
		System.out.printf("--%d = %d\n", a, (short)(--a)); 

		//postfix decrement
		a = 5;
		System.out.printf("%d-- = %d\n", a, (short)(a--));  

		System.out.println("\n***** Bitwise Operators *****");
		
		//bitwise AND
		c = (short)(a & b); 
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		//bitwise OR
		c = (short)(a | b); 
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		//bitwice XOR
		c = (short)(a ^ b); 
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		//bitwice unary compliment
		c = (short)(~a); 
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		//left shift
		c = (short)(a << 1); 
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		//right shift
		c = (short)(a >> 1); 
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		//right shift
		a = -5;
		c = (short)(a >> 1); 
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		// zero fill right shift
		a = 5;
		c = (short)(a >>> 1); 
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		// zero fill right shift
		a = -5;
		c = (short)(a >>> 1); 
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		
		System.out.println("\n***** Assignment Operators *****");
		
		c = 7;
		
		//assignment arithmetical operators
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		// c /= 0; --> Arithmetical Exception
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
		// c %= 0; --> Arithmetical Exception

		//assignment bitwise operators
		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
		
		System.out.println("\n***** Relational Operators *****");
		
		// greater than
		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		// equal to
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%d != %d --> %b\n", a, b, a != b);
		
		System.out.println("\n***** Logical Operations *****");
		
		// logical AND
		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
		// bitwise logical AND
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
		// logical OR
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
		// bitwise logical OR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
		// logical XOR
		System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
		// logical NOT
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
		
		System.out.println("\n***** Misc Operators *****");
		
		System.out.println("\nCondition Operator:");
		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));
		
		System.out.println("\nType Cast Operator:");
		byte byt = 8;
		int in = 125000;
		char ch = '\u0033';
		long l = 100000000000000000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;
		
		//cast byte to short
		c = byt;
		System.out.printf("short = byte: c = %d --> c = %d\n", byt, c);

		//cast int to short
		c = (short)in;
		System.out.printf("short = int: c = (short)%d --> c = %d\n", in, c);
		
		//cast char to short
		c = (short)ch;
		System.out.printf("short = char: c = (short)'%c' --> c = %d\n", ch, c);
		
		//cast long to short
		c = (short)l;
		System.out.printf("short = long: c = (short)%d --> c = %d\n", l, c);

		//cast float to short
		c = (short)f;
		System.out.printf("short = float: c = (short)%f --> c = %d\n", f, c);
		
		//cast double to short
		c = (short)d;
		System.out.printf("short = double: c = (short)%f --> c = %d\n", d, c);

		//cast bollean to short
		System.out.printf("short = boolean: c = (short)%b --> Compile Error\n", bool);
	}

	public static void testChar(){
		char a = '\u0042', b = '\u0021', c;
		System.out.println("\n ***** Arithmetical Operators *****");
		
		//addition
		c = (char)(a + b); 
		System.out.printf("%c + %c = %c\n", a, b, c);

		//subtraction
		c = (char)(a - b); 
		System.out.printf("%c - %c = %c\n", a, b, c);

		//multiplication
		c = (char)(a * b); 
		System.out.printf("%c * %c = %c\n", a, b, c);

		//division
		c = (char)(a / b); 
		System.out.printf("%c / %c = %c\n", a, b, c);
		// c = (char)(a % b); --> Arithmetical Exception

		//modulus
		c = (char)(a % b);
		System.out.printf("%c %% %c = %c\n", a, b, c);
		// c = (char)(a % b); --> Arithmetical Exception

		a = '\u0042';

		//unary minus
		//there are no symbols with negative code in ASCII table
		//c = (char)(-a);

		//unary plus
		c = (char)(+a); 
		System.out.printf("+%c = %c\n", a, c);

		//prefix increment
		a = '\u0042';
		System.out.printf("++%c = %c\n", a, ++a); 

		//postfix increment
		a = '\u0042';
		System.out.printf("%c++ = %c\n", a, a++);

		//prefix decrement
		a = '\u0042';
		System.out.printf("--%c = %c\n", a, --a); 

		//postfix decrement
		a = '\u0042';
		System.out.printf("%c-- = %c\n", a, a--); 

		System.out.println("\n***** Bitwise Operators *****");

		//bitwise AND
		c = (char)(a & b); 
		System.out.printf("%c & %c = %c\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		//bitwise OR
		c = (char)(a | b); 
		System.out.printf("%c | %c = %c\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		//bitwice XOR
		c = (char)(a ^ b); 
		System.out.printf("%c ^ %c = %c\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		//bitwice unary compliment
		c = (char)(~a); 
		System.out.printf("~%c = %c\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		//left shift
		c = (char)(a << 1); 
		System.out.printf("%c << 1 = %c\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		//right shift
		c = (char)(a >> 1); 
		System.out.printf("%c >> 1 = %c\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		//right shift
		a = '\u0042';
		c = (char)(a >> 1); 
		System.out.printf("%c >> 1 = %c\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		// zero fill right shift
		a = '\u0042';
		c = (char)(a >>> 1); 
		System.out.printf("%c >>> 1 = %c\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		// zero fill right shift
		a = '\u0042';
		c = (char)(a >>> 1); 
		System.out.printf("%c >>> 1 = %c\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		System.out.println("\n***** Assignment Operators *****");
		
		c = '\u0033';
		
		//assignment arithmetical operators
		System.out.printf("%c += %c --> c = %c\n", c, a, c += a);
		System.out.printf("%c -= %c --> c = %c\n", c, a, c -= a);
		System.out.printf("%c *= %c --> c = %c\n", c, a, c *= a);
		System.out.printf("%c /= %c --> c = %c\n", c, a, c /= a);
		// c /= 0; --> Arithmetical Exception
		System.out.printf("%c %%= %c --> c = %c\n", c, a, c %= a);
		// c %= 0; --> Arithmetical Exception

		//assignment bitwise operators
		System.out.printf("%c |= %c --> c = %c\n", c, a, c |= a);
		System.out.printf("%c &= %c --> c = %c\n", c, a, c &= a);
		System.out.printf("%c ^= %c --> c = %c\n", c, a, c ^= a);
		c = '\u0044';
		System.out.printf("%c >>= 1 --> c = %c\n", c, c >>= 1);
		c = '\u0033';
		System.out.printf("%c <<= 1 --> c = %c\n", c, c <<= 1);
		c = '\u0044';
		System.out.printf("%c >>>= 1 --> c = %c\n", c, c >>>= 1);
		
		System.out.println("\n***** Relational Operators *****");
		//symbols are compared by ASCII code
		
		a = '\u0033'; b = '\u0044';
		// greater than
		System.out.printf("%c > %c --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%c >= %c --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%c < %c --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%c <= %c --> %b\n", a, b, a <= b);
		// equal to
		System.out.printf("%c == %c --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%c != %c --> %b\n", a, b, a != b);
		
		System.out.println("\n***** Logical Operations *****");
		
		// logical AND
		System.out.printf("(%c > %c) && (%c > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
		// bitwise logical AND
		System.out.printf("(%c > %c) & (%c > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
		// logical OR
		System.out.printf("(%c >= %c) || (%c != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
		// bitwise logical OR
		System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
		// logical XOR
		System.out.printf("(%c >= %c) ^ (%c != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
		// logical NOT
		System.out.printf("!(%c >= %c) --> %b\n", a, b, !(a >= b));
		
		System.out.println("\n***** Misc Operators *****");
		
		System.out.println("\nCondition Operator:");
		System.out.printf("%c > %c ? %c : %c --> %c\n", a, b, a, b, (a > b ? a : b));
		
		System.out.println("\nType Cast Operator:");
		byte bt = 33;
		short sh = 32000;
		int in = 589;
		long l = 100000000000000111L;
		float f = 44.9f;
		double d = 123456789.625;
		boolean bool = true;
		
		//cast byte to char
		c = (char)bt;
		System.out.printf("char = byte: c = (char)%d --> c = %c\n", bt, c);
		
		//cast short to char
		c = (char)sh;
		System.out.printf("char = short: c = (char)%d --> c = %c\n", sh, c);
		
		//cast int to char
		c = (char)in;
		System.out.printf("char = int: c = (char)%d --> c = %c\n", in, c);
		
		//cast long to char
		c = (char)l;
		System.out.printf("char = long: c = (char)%d --> c = %c\n", l, c);

		//cast float to char
		c = (char)f;
		System.out.printf("char = float: c = (char)%f --> c = %c\n", f, c);
		
		//cast double to char
		c = (char)d;
		System.out.printf("char = double: c = (char)%f --> c = %c\n", d, c);

		//cast boolean to char
		System.out.printf("char = boolean: c = (char)%b --> Compile Error\n", bool);
	}

	public static void testInt(){
		int a = 5, b = 2, c;
		System.out.println("\n ***** Arithmetical Operators *****");
		
		//addition
		c = a + b; 
		System.out.printf("%d + %d = %d\n", a, b, c);

		//subtraction
		c = a - b; 
		System.out.printf("%d - %d = %d\n", a, b, c);

		//multiplication
		c = a * b; 
		System.out.printf("%d * %d = %d\n", a, b, c);

		//division
		c = a / b; 
		System.out.printf("%d / %d = %d\n", a, b, c);
		// c = a / 0; --> Arithmetical Exception

		//modulus
		c = a % b;
		System.out.printf("%d %% %d = %d\n", a, b, c);
		// c = a % 0; --> Arithmetical Exception

		a = 5;

		//unary minus
		c = -a; 
		System.out.printf("-%d = %d\n", a, c);

		//unary plus
		c = +a; 
		System.out.printf("+%d = %d\n", a, c);

		//prefix increment
		a = 5;
		System.out.printf("++%d = %d\n", a, ++a); 

		//postfix increment
		a = 5;
		System.out.printf("%d++ = %d\n", a, a++);

		//prefix decrement
		a = 5;
		System.out.printf("--%d = %d\n", a, --a); 

		//postfix decrement
		a = 5;
		System.out.printf("%d-- = %d\n", a, a--); 

		System.out.println("\n***** Bitwise Operators *****");

		//bitwise AND
		c = a & b; 
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		//bitwise OR
		c = a | b; 
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

		//bitwice XOR
		c = a ^ b; 
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		//bitwice unary compliment
		c = ~a; 
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		//left shift
		c = a << 1; 
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

		//right shift
		c = a >> 1; 
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		//right shift
		a = -5;
		c = a >> 1; 
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		// zero fill right shift
		a = 5;
		c = a >>> 1; 
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		// zero fill right shift
		a = -5;
		c = a >>> 1; 
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		System.out.println("\n***** Assignment Operators *****");
		
		c = 7;
		
		//assignment arithmetical operators
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		// c /= 0; --> Arithmetical Exception
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
		// c %= 0; --> Arithmetical Exception

		//assignment bitwise operators
		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
		
		System.out.println("\n***** Relational Operators *****");
		
		// greater than
		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		// equal to
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%d != %d --> %b\n", a, b, a != b);
		
		System.out.println("\n***** Logical Operations *****");
		
		// logical AND
		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
		// bitwise logical AND
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
		// logical OR
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
		// bitwise logical OR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
		// logical XOR
		System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
		// logical NOT
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
		
		System.out.println("\n***** Misc Operators *****");
		
		System.out.println("\nCondition Operator:");
		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));
		
		System.out.println("\nType Cast Operator:");
		byte bt = 1;
		short sh = -32000;
		char ch = '\u0044';
		long l = 100000000000000000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;
		
		//cast byte to int
		c = bt;
		System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
		
		//cast short to int
		c = sh;
		System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
		
		//cast char to int
		c = ch;
		System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
		
		//cast long to int
		c = (int) l;
		System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);

		//cast float to int
		c = (int) f;
		System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
		
		//cast double to int
		c = (int) d;
		System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);

		//cast boolean to int
		System.out.printf("int = boolean: c = (int)%b --> Compile Error\n", bool);
	}

	public static void testLong(){
		long a = 90000000000000000L, b = 100000000000000000L, c;
		System.out.println("\n ***** Arithmetical Operators *****");
		
		//addition
		c = a + b; 
		System.out.printf("%d + %d = %d\n", a, b, c);

		//subtraction
		c = a - b; 
		System.out.printf("%d - %d = %d\n", a, b, c);

		//multiplication
		c = a * b; 
		System.out.printf("%d * %d = %d\n", a, b, c);

		//division
		c = a / b; 
		System.out.printf("%d / %d = %d\n", a, b, c);
		// c = a / 0; --> Arithmetical Exception

		//modulus
		c = a % b;
		System.out.printf("%d %% %d = %d\n", a, b, c);
		// c = a % 0; --> Arithmetical Exception

		a = 90000000000000000L;

		//unary minus
		c = -a; 
		System.out.printf("-%d = %d\n", a, c);

		//unary plus
		c = +a; 
		System.out.printf("+%d = %d\n", a, c);

		//prefix increment
		a = 90000000000000000L;
		System.out.printf("++%d = %d\n", a, ++a); 

		//postfix increment
		a = 90000000000000000L;
		System.out.printf("%d++ = %d\n", a, a++);

		//prefix decrement
		a = 90000000000000000L;
		System.out.printf("--%d = %d\n", a, --a); 

		//postfix decrement
		a = 90000000000000000L;
		System.out.printf("%d-- = %d\n", a, a--); 

		System.out.println("\n***** Bitwise Operators *****");

		//bitwise AND
		c = a & b; 
		System.out.printf("%d & %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s & %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));
		
		//bitwise OR
		c = a | b; 
		System.out.printf("%d | %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s | %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));

		//bitwice XOR
		c = a ^ b; 
		System.out.printf("%d ^ %d = %d\n", a, b, c);
		System.out.println("in binary form:");
		System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));
		
		//bitwice unary compliment
		c = ~a; 
		System.out.printf("~%d = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("~%s = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));
		
		//left shift
		c = a << 1; 
		System.out.printf("%d << 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s << 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

		//right shift
		c = a >> 1; 
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));
		
		//right shift
		a = -90000000000000000L;
		c = a >> 1; 
		System.out.printf("%d >> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));
		
		// zero fill right shift
		a = 90000000000000000L;
		c = a >>> 1; 
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));
		
		// zero fill right shift
		a = -90000000000000000L;
		c = a >>> 1; 
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));
		
		System.out.println("\n***** Assignment Operators *****");
		
		c = 70000000000000000L;
		
		//assignment arithmetical operators
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		// c /= 0; --> Arithmetical Exception
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
		// c %= 0; --> Arithmetical Exception

		//assignment bitwise operators
		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
		
		System.out.println("\n***** Relational Operators *****");
		
		// greater than
		System.out.printf("%d > %d --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%d < %d --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		// equal to
		System.out.printf("%d == %d --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%d != %d --> %b\n", a, b, a != b);
		
		System.out.println("\n***** Logical Operations *****");
		
		// logical AND
		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
		// bitwise logical AND
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
		// logical OR
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
		// bitwise logical OR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
		// logical XOR
		System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
		// logical NOT
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
		
		System.out.println("\n***** Misc Operators *****");
		
		System.out.println("\nCondition Operator:");
		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));
		
		System.out.println("\nType Cast Operator:");
		byte bt = 1;
		short sh = -32000;
		char ch = '\u0044';
		int in = 5;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;
		
		//cast byte to long
		c = bt;
		System.out.printf("long = byte: c = %d --> c = %d\n", bt, c);
		
		//cast short to long
		c = sh;
		System.out.printf("long = short: c = %d --> c = %d\n", sh, c);
		
		//cast char to long
		c = ch;
		System.out.printf("long = char: c = '%c' --> c = %d\n", ch, c);
		
		//cast int to long
		c = in;
		System.out.printf("long = int: c = %d --> c = %d\n", in, c);

		//cast float to long
		c = (long) f;
		System.out.printf("long = float: c = (long)%f --> c = %d\n", f, c);
		
		//cast double to long
		c = (long) d;
		System.out.printf("long = double: c = (long)%f --> c = %d\n", d, c);

		//cast boolean to long
		System.out.printf("long = boolean: c = (long)%b --> Compile Error\n", bool);
	}

	public static void testFloat(){
		float a = 25.5f, b = 362.1f, c;
		System.out.println("\n ***** Arithmetical Operators *****");
		
		//addition
		c = a + b; 
		System.out.printf("%f + %f = %f\n", a, b, c);

		//subtraction
		c = a - b; 
		System.out.printf("%f - %f = %f\n", a, b, c);

		//multiplication
		c = a * b; 
		System.out.printf("%f * %f = %f\n", a, b, c);

		//division
		c = a / b; 
		System.out.printf("%f / %f = %f\n", a, b, c);
		// c = a / 0; --> Arithmetical Exception

		//modulus
		c = a % b;
		System.out.printf("%f %% %f = %f\n", a, b, c);
		// c = a % 0; --> Arithmetical Exception

		a = 25.5f;

		//unary minus
		c = -a; 
		System.out.printf("-%f = %f\n", a, c);

		//unary plus
		c = +a; 
		System.out.printf("+%f = %f\n", a, c);

		//prefix increment
		a = 25.5f;
		System.out.printf("++%f = %f\n", a, ++a); 

		//postfix increment
		a = 25.5f;
		System.out.printf("%f++ = %f\n", a, a++);

		//prefix decrement
		a = 25.5f;
		System.out.printf("--%f = %f\n", a, --a); 

		//postfix decrement
		a = 25.5f;
		System.out.printf("%f-- = %f\n", a, a--); 

		System.out.println("\n***** Bitwise Operators *****");

		/*c = a & b; // bitwise AND
		c = a | b; // bitwise OR
		c = a ^ b; // bitwise XOR
		c = ~a; // bitwise unary compliment
		c = a << 1; // left shift
		c = a >> 1; // right shift
		c = a >> 1; // right shift
		c = a >>> 1; // zero fill right shift
		c = a >>> 1; // zero fill right shift*/
		
		System.out.println("\n***** Assignment Operators *****");
		
		c = 25.4f;
		
		//assignment arithmetical operators
		System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
		System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
		System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
		System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
		// c /= 0; --> Arithmetical Exception
		System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
		// c %= 0; --> Arithmetical Exception

		/*c |= a;
		c &= a;
		c ^= a;
		c >>= 1;
		c <<= 1;
		c >>>= 1;*/
		
		System.out.println("\n***** Relational Operators *****");
		
		// greater than
		System.out.printf("%f > %f --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%f < %f --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
		// equal to
		System.out.printf("%f == %f --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%f != %f --> %b\n", a, b, a != b);
		
		System.out.println("\n***** Logical Operations *****");
		
		// logical AND
		System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
		// bitwise logical AND
		System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
		// logical OR
		System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
		// bitwise logical OR
		System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
		// logical XOR
		System.out.printf("(%f >= %f) ^ (%f != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
		// logical NOT
		System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));
		
		System.out.println("\n***** Misc Operators *****");
		
		System.out.println("\nCondition Operator:");
		System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));
		
		System.out.println("\nType Cast Operator:");
		byte bt = 1;
		short sh = -32000;
		char ch = '\u0044';
		int in = 5;
		long l = 10000000000000L;
		double d = 1.9;
		boolean bool = true;
		
		//cast byte to float
		c = bt;
		System.out.printf("float = byte: c = %d --> c = %f\n", bt, c);
		
		//cast short to float
		c = sh;
		System.out.printf("float = short: c = %d --> c = %f\n", sh, c);
		
		//cast char to float
		c = ch;
		System.out.printf("float = char: c = '%c' --> c = %f\n", ch, c);
		
		//cast int to float
		c = in;
		System.out.printf("float = int: c = %d --> c = %f\n", in, c);

		//cast long to float
		c = l;
		System.out.printf("float = long: c = %d --> c = %f\n", l, c);

		//cast double to float
		c = (float)d;
		System.out.printf("float = double: c = (float)%f --> c = %f\n", d, c);
		
		//cast boolean to float
		System.out.printf("float = boolean: c = (float)%b --> Compile Error\n", bool);
	}

	public static void testDouble(){
		double a = 25.5, b = 362.3, c;
		System.out.println("\n ***** Arithmetical Operators *****");
		
		//addition
		c = a + b; 
		System.out.printf("%f + %f = %f\n", a, b, c);

		//subtraction
		c = a - b; 
		System.out.printf("%f - %f = %f\n", a, b, c);

		//multiplication
		c = a * b; 
		System.out.printf("%f * %f = %f\n", a, b, c);

		//division
		c = a / b; 
		System.out.printf("%f / %f = %f\n", a, b, c);
		// c = a / 0; --> Arithmetical Exception

		//modulus
		c = a % b;
		System.out.printf("%f %% %f = %f\n", a, b, c);
		// c = a % 0; --> Arithmetical Exception

		a = 25.5;

		//unary minus
		c = -a; 
		System.out.printf("-%f = %f\n", a, c);

		//unary plus
		c = +a; 
		System.out.printf("+%f = %f\n", a, c);

		//prefix increment
		a = 25.5;
		System.out.printf("++%f = %f\n", a, ++a); 

		//postfix increment
		a = 25.5;
		System.out.printf("%f++ = %f\n", a, a++);

		//prefix decrement
		a = 25.5;
		System.out.printf("--%f = %f\n", a, --a); 

		//postfix decrement
		a = 25.5;
		System.out.printf("%f-- = %f\n", a, a--); 

		System.out.println("\n***** Bitwise Operators *****");

		/*c = a & b; // bitwise AND
		c = a | b; // bitwise OR
		c = a ^ b; // bitwise XOR
		c = ~a; // bitwise unary compliment
		c = a << 1; // left shift
		c = a >> 1; // right shift
		c = a >> 1; // right shift
		c = a >>> 1; // zero fill right shift
		c = a >>> 1; // zero fill right shift*/
		
		System.out.println("\n***** Assignment Operators *****");
		
		c = 70000000000000000L;
		
		//assignment arithmetical operators
		System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
		System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
		System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
		System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
		// c /= 0; --> Arithmetical Exception
		System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
		// c %= 0; --> Arithmetical Exception

		/*c |= a;
		c &= a;
		c ^= a;
		c >>= 1;
		c <<= 1;
		c >>>= 1;*/
		
		System.out.println("\n***** Relational Operators *****");
		
		// greater than
		System.out.printf("%f > %f --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%f < %f --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
		// equal to
		System.out.printf("%f == %f --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%f != %f --> %b\n", a, b, a != b);
		
		System.out.println("\n***** Logical Operations *****");
		
		// logical AND
		System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
		// bitwise logical AND
		System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
		// logical OR
		System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
		// bitwise logical OR
		System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
		// logical XOR
		System.out.printf("(%f >= %f) ^ (%f != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
		// logical NOT
		System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));
		
		System.out.println("\n***** Misc Operators *****");
		
		System.out.println("\nCondition Operator:");
		System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));
		
		System.out.println("\nType Cast Operator:");
		byte bt = 1;
		short sh = -32000;
		char ch = '\u0044';
		int in = 5;
		long l = 10000000000000L;
		float f = 1.9f;
		boolean bool = true;
		
		//cast byte to double
		c = bt;
		System.out.printf("double = byte: c = %d --> c = %f\n", bt, c);
		
		//cast short to double
		c = sh;
		System.out.printf("double = short: c = %d --> c = %f\n", sh, c);
		
		//cast char to double
		c = ch;
		System.out.printf("double = char: c = '%c' --> c = %f\n", ch, c);
		
		//cast int to double
		c = in;
		System.out.printf("double = int: c = %d --> c = %f\n", in, c);

		//cast long to double
		c = l;
		System.out.printf("double = long: c = %d --> c = %f\n", l, c);

		//cast float to double
		c = f;
		System.out.printf("double = float: c = %f --> c = %f\n", f, c);
		
		//cast boolean to double
		System.out.printf("double = boolean: c = (double)%b --> Compile Error\n", bool);
	}

	public static void testBoolean(){
		boolean a = true, b = false, c;

		System.out.println("\n***** Arithmetical Operators *****");
		// c = a + b; // addition
		// c = a - b; // subtraction
		// c = a * b; // multiplication
		// c = a / b; // division
		// c = a % b; // modulus
		// c = -a; // unary minus
		// c = +a; // unary plus
		// c = ++a; // prefix increment
		// c = a++; // postfix increment
		// c = --a; // prefix decrement
		// c = a--; // postfix decrement

		System.out.println("\n***** Bitwise Operators *****");

		// bitwise AND
		c = a & b; 
		System.out.printf("%b & %b = %b\n", a, b, c);

		// bitwise OR
		c = a | b; 
		System.out.printf("%b | %b = %b\n", a, b, c);

		// bitwise XOR
		c = a ^ b; 
		System.out.printf("%b ^ %b = %b\n", a, b, c);

		// c = ~a; // bitwise unary compliment
		// c = a << 1; // left shift
		// c = a >> 1; //right shift
		// c = a >>> 1; // zero fill right shift

		System.out.println("\n***** Assignment Operators *****");

		System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
		System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
		System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);

		// c += a;
		// c -= a;
		// c *= a;
		// c /= a;
		// c %= a;
		// c >>= 1;
		// c <<= 1;
		// c >>>= 1;

		System.out.println("\n***** Relational Operators *****");

		// equal to
		System.out.printf("%b == %b --> %b\n", a, b, a == b);

		// not equal to
		System.out.printf("%b != %b --> %b\n", a, b, a != b);

		// c = a > b; // greater than
		// c = a >= b; // greater than or equal to
		// c = a < b; // less than
		// c = a <= b; // less than or equal to

		System.out.println("\n***** Logical Operations *****");

		c = a && b; // logical AND
		System.out.printf("%b && %b = %b\n", a, b, c);

		c = a || b; // logical OR
		System.out.printf("%b || %b = %b\n", a, b, c);

		c = a ^ b; // logical XOR
		System.out.printf("%b ^ %b = %b\n", a, b, c);

		// logical NOT
		System.out.printf("!%b --> %b\n", a, !a);

		System.out.println("\n***** Misc Operators *****");

		System.out.println("\nCondition Operator:");

		System.out.printf(" %b ? %b : %b --> %b\n", c, a, b, (c ? a : b));
		System.out.println("\nType Cast Operator:");

		// byte bt = 1;
		// short sh = -32000;
		// char ch = '\u0002';
		// long l = 100000000000000000L;
		// float f = 1.9f;
		// double d = 123456789.625;

		boolean bool = true;

		//c = (boolean) bt;
		//c = (boolean) sh;
		//c = (boolean) ch;
		//c = (boolean) l;
		//c = (boolean) f;
		//c = (boolean) d;

		c = bool;
	}

	public static void testString(){
		String a = "fd", b = "dsvs", c;

		System.out.println("\n ***** Arithmetical Operators *****");
		
		// addition
		c = a + b; 
		System.out.printf("%s + %s = %s\n", a, b, c);

		//c = a - b; // subtraction
		// c = a * b; // multiplication
		// c = a / b; // division
		// c = a % b; // modulus
		// c = -a; // unary minus
		// c = +a; // unary plus
		// c = ++a; // prefix increment
		// c = a++; // postfix increment
		// c = --a; // prefix decrement
		// c = a--; // postfix decrement

		System.out.println("\n***** Bitwise Operators *****");

		/*//bitwise AND
		c = a & b; 
		c = a | b; 
		c = a ^ b; 
		c = ~a; 
		c = a << 1; 
		c = a >> 1; 
		c = a >> 1; 
		c = a >>> 1; 		
		c = a >>> 1; */
		
		System.out.println("\n***** Assignment Operators *****");
		
		
		
		//assignment arithmetical operators
		System.out.printf("%s += %s --> c = %s\n", c, a, c += a);

		/*c -= a;
		c *= a;
		c /= a;
		c %= a;
		c |= a;
		c &= a;
		c ^= a;
		c >>= 1;
		c <<= 1;
		c >>>= 1;*/
		
		System.out.println("\n***** Relational Operators *****");
		
		// c = a > b; // greater than
		// c = a >= b; // greater than or equal to
		// c = a < b; // less than
		// c = a <= b; // less than or equal to

		// equal to
		System.out.printf("%s == %s --> %b\n", a, b, a == b);

		// not equal to
		System.out.printf("%s != %s --> %b\n", a, b, a != b);
		
		System.out.println("\n***** Logical Operations *****");
		
		// logical AND
		System.out.printf("(%s == %s) && (%s != \"0\") --> %b\n", a, b, a, (a == b) && (a != "0"));
		// bitwise logical AND
		System.out.printf("(%s == %s) & (%s == \"0\") --> %b\n", a, b, a, (a == b) & (a == "0"));
		// logical OR
		System.out.printf("(%s == %s) || (%s != \"0\") --> %b\n", a, b, b, (a == b) || (b != "0"));
		// bitwise logical OR
		System.out.printf("(%s != %s) | (%s != \"0\") --> %b\n", a, b, b, (a != b) | (b != "0"));
		// logical XOR
		System.out.printf("(%s != %s) ^ (%s != \"0\") --> %b\n", a, b, b, (a != b) ^ (b != "0"));
		// logical NOT
		System.out.printf("!(%s == %s) --> %b\n", a, b, !(a == b));
		
		System.out.println("\n***** Misc Operators *****");
		
		System.out.println("\nCondition Operator:");
		System.out.printf("%s == %s ? %s : %s --> %s\n", a, b, a, b, (a == b ? a : b));
		
		byte bt = 1;
		short sh = -32000;
		char ch = '\u0044';
		int in = 78;
		long l = 100000000000000000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;

		System.out.println("\nType Cast Operator:");
		System.out.printf("String = byte: c = (String)%d --> Compile Error\n", bt);
		System.out.printf("String = short: c = (String)%d --> Compile Error\n", sh);
		System.out.printf("String = int: c = (String)%d --> Compile Error\n", in);
		System.out.printf("String = long: c = (String)%d --> Compile Error\n", l);
		System.out.printf("String = char: c = (String)%s --> Compile Error\n", ch);
		System.out.printf("String = float: c = (String)%f --> Compile Error\n", f);
		System.out.printf("String = double: c = (String)%f --> Compile Error\n", d);
		System.out.printf("String = boolean: c = (String)%b --> Compile Error\n", bool);

		c = String.valueOf(bt);
		System.out.printf("\nString = byte: c = String.valueOf(%d) --> c = %s\n", bt, c);

		c = String.valueOf(sh);
		System.out.printf("String = short: c = String.valueOf(%d) --> c = %s\n", sh, c);

		c = String.valueOf(ch);
		System.out.printf("String = char: c = String.valueOf(%c) --> c = %s\n", ch, c);

		c = String.valueOf(in);
		System.out.printf("String = int: c = String.valueOf(%d) --> c = %s\n", in, c);

		c = String.valueOf(l);
		System.out.printf("String = long: c = String.valueOf(%d) --> c = %s\n", l, c);

		c = String.valueOf(f);
		System.out.printf("String = float: c = String.valueOf(%f) --> c = %s\n", f, c);

		c = String.valueOf(d);
		System.out.printf("String = double: c = String.valueOf(%f) --> c = %s\n", d, c);

		c = String.valueOf(bool);
		System.out.printf("String = boolean: c = String.valueOf(%b) --> c = %s\n", bool, c);
	}

	public static void testStudent(){
		Student a = new Student("Bob", 5), b = new Student("John", 6), c;
		System.out.println("\n ***** Arithmetical Operators *****");
		
		/*c = a + b;
		c = a - b; 
		c = a * b; 
		c = a / b; 
		c = a % b;
		c = -a; 
		c = +a; 
		c = ++a;
		c = a++;
		c = --a;
		c = a--;*/

		System.out.println("\n***** Bitwise Operators *****");

		/*c = a & b; 
		c = a | b; 
		c = a ^ b; 
		c = ~a; 		
		c = a << 1; 
		c = a >> 1; 
		c = a >> 1;
		c = a >>> 1; 
		c = a >>> 1; */
		
		System.out.println("\n***** Assignment Operators *****");
		
		/*c += a;
		c -= a;
		c *= a;
		c /= a;
		c %= a;
		c |= a;
		c &= a;
		c ^= a;
		c >>= 1;
		c <<= 1;
		c >>>= 1;*/
		
		System.out.println("\n***** Relational Operators *****");
		
		/*a >= b;
		a > b;
		a <= b;
		a < b;*/

		//only addresses are compared
		System.out.printf("%s == %s --> %b\n", a.toString(), b.toString(), a == b);
		System.out.printf("%s != %s --> %b\n", a.toString(), b.toString(), a != b);
		
		System.out.println("\n***** Logical Operations *****");

		c = a;
		// logical AND
		System.out.printf("(%s == %s) && (%s == %s) --> %b\n", a.toString(), b.toString(), a.toString(), c.toString(), (a == b) && (a == c));

		// bitwise logical AND
		System.out.printf("(%s == %s) & (%s != %s) --> %b\n", a.toString(), b.toString(), a.toString(), c.toString(), (a == b) & (a != c));

		// logical OR
		System.out.printf("(%s == %s) || (%s != %s) --> %b\n", a.toString(), b.toString(), b.toString(), c.toString(), (a == b) || (b != c));

		// bitwise logical OR
		System.out.printf("(%s == %s) | (%s != %s) --> %b\n", a.toString(), b.toString(), b.toString(), c.toString(), (a == b) | (b != c));

		// logical XOR
		System.out.printf("(%s == %s) | (%s != %s) --> %b\n", a.toString(), b.toString(), b.toString(), c.toString(), (a == b) ^ (b != c));

		// logical NOT
		System.out.printf("!(%s == %s) --> %b\n", a.toString(), b.toString(), !(a == b));		
		
		System.out.println("\n***** Misc Operators *****");
		
		System.out.println("\nCondition Operator:");
		System.out.printf("%s == %s ? %s : %s --> %s\n", a.toString(), b.toString(), a.toString(), b.toString(), (a == b ? a : b));
		
		// byte bt = 1;
		// short sh = -32000;
		// char ch = '\u0002';
		// int in = 589;
		// long l = 100000000000000000L;
		// float f = 1.9f;
		// double d = 123456789.625;
		// boolean b = true;

		//c = (Student) bt;
		//c = (Student) sh;
		//c = (Student) ch;
		//c = (Student) l;
		//c = (Student) f;
		//c = (Student) d;
		//c = (Student) in;
		//c = (Student) b;
	}
}