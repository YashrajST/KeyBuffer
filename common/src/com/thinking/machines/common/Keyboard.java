package com.thinking.machines.common;
import java.io.*;
public class Keyboard
{
static InputStreamReader isr;
static BufferedReader bufferedReader;
static
{
isr=new InputStreamReader(System.in);
bufferedReader=new BufferedReader(isr);
}

public static String getString()
{
String s="";
try
{
s=bufferedReader.readLine();
}catch(IOException ioe)
{
System.out.println(ioe);
}
return s;
}
public static String getString(String q)
{
System.out.print(q);
return getString();
}

public static char getCharacter()
{
char a;
try
{
a=(char)bufferedReader.read();
while(bufferedReader.ready()) bufferedReader.read();
}catch(IOException ioe)
{
a=0;
System.out.println(ioe);
}
return a;
}

public static char getCharacter(String s)
{
System.out.print(s);
return getCharacter();
}

public static int getInt()
{
int i=0;
try
{
i=Integer.parseInt(getString());
}catch(NumberFormatException nfe)
{
}
return i;
}

public static int getInt(String s)
{
System.out.print(s);
return getInt();
}

public static long getLong()
{
long l=0;
try
{
l=Long.parseLong(getString());
}catch(NumberFormatException nfe)
{
System.out.println(nfe);
}
return l;
}
public static long getLong(String message)
{
System.out.print(message);
return getLong();
}
public static short getShort()
{
short s=0;
try
{
s=Short.parseShort(getString());
}catch(NumberFormatException nfe)
{
}
return s;
}
public static short getShort(String message)
{
System.out.print(message);
return getShort();
}

public static byte getByte()
{
byte b=0;
try
{
b=Byte.parseByte(getString());
}catch(NumberFormatException nfe)
{
}
return b;
}
public static byte getByte(String message)
{
System.out.print(message);
return getByte();
}

public static double getDouble()
{
double d=0;
try
{
d=Double.parseDouble(getString());
}catch(NumberFormatException nfe)
{
}
return d;
}
public static double getDouble(String message)
{
System.out.print(message);
return getDouble();
}

public static float getFloat()
{
float f=0;
try
{
f=Float.parseFloat(getString());
}catch(NumberFormatException nfe)
{
}
return f;
}
public static float getFloat(String message)
{
System.out.print(message);
return getFloat();
}

public static boolean getBoolean()
{
boolean b=false;
try
{
b=Boolean.parseBoolean(getString());
}catch(NumberFormatException nfe)
{
}
return b;
}
public static boolean getBoolean(String message)
{
System.out.print(message);
return getBoolean();
}
}