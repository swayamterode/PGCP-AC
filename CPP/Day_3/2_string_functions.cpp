#include <iostream>
using namespace std;
int mystrlen(char *s)
{
	int i;
	for(i=0;s[i]!='\0';i++);
	return i;
}

// char *mystrcpy(char *dest,char *sour)
// {
// 	int i;
// 	for(i=0;sour[i]!='\0';i++)
// 	   dest[i]=sour[i];
// 	dest[i]='\0';
// 	return dest;
// }


char *mystrcpy(char *tar,char *sou)
  {
  	char *t=tar;
    while(*tar++ = *sou++) ;
    return t;
  } 
  
  
//char *mystrcat(char *dest,char *sour)
//{
//	int i,j;
//	for(i=0;dest[i]!='\0';i++);
//	for(j=0;sour[j]!='\0';j++,i++)
//	   dest[i]=sour[j];
//	dest[i]='\0';
//	return dest;
//}

  char *mystrcat(char *tar,char *sou)
  {
     char *p=tar;
     while(*p!='\0')  p++;
     while(*p++ = *sou++) ;
     return tar;
  }

int mystrcmp(char *s1,char *s2)
{
	while((*s1!='\0')&&(*s2!='\0'))
	{
		if(*s1!=*s2)
		  return *s1-*s2; 
		s1++; s2++;
	}
	return *s1-*s2;
}

char *mystrrev(char *s)
{
	int l,i;
	char t;
	for(l=0;s[l]!='\0';l++);
	l=l-1;
	for(i=0;i<l;i++,l--)
	{
		t=s[i];
		s[i]=s[l];
		s[l]=t;
	}
	return s;
}

char *toLower(char *s)
{
	int i;
	for(i=0;s[i]!='\0';i++)
	{
		if((s[i]>=65)&&(s[i]<=92))
		   s[i]=s[i]+32;
    }
    return s;
}

char *toUpper(char *s)
{
	int i;
	for(i=0;s[i]!='\0';i++)
	{
		if((s[i]>=97)&&(s[i]<=124))
		  s[i]=s[i]-32;
	}
	return s;
}

int main()
{
		char src[] = "Hello";
		char dest[100];
		cout << "src: " << src << " length: " << mystrlen(src) << endl;

		mystrcpy(dest, src);
		cout << "after mystrcpy, dest: " << dest << endl;

		char a[100] = "Hello, ";
		char b[] = "World!";
		mystrcat(a, b);
		cout << "after mystrcat: " << a << endl;

		char c1[] = "abc";
		char c2[] = "abc";
		char c3[] = "abd";
		cout << "mystrcmp(c1,c2): " << mystrcmp(c1, c2) << endl;
		cout << "mystrcmp(c1,c3): " << mystrcmp(c1, c3) << endl;

		char r[] = "stressed";
		cout << "before mystrrev: " << r << endl;
		mystrrev(r);
		cout << "after mystrrev: " << r << endl;

		char up[] = "MiXeD Case 123";
		cout << "toLower: " << toLower(up) << endl;
		char low[] = "mixed case 123";
		cout << "toUpper: " << toUpper(low) << endl;

		return 0;
}