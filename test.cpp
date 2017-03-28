#include "data.h"
#include <vector>
#include <string>
#include <iostream>

using namespace std;

#ifdef TEST
#define yyconst const
typedef struct yy_buffer_state *YY_BUFFER_STATE;
extern vector<base*> tokens;
extern int yylex (void);
extern YY_BUFFER_STATE yy_scan_string (yyconst char * yystr );
extern void clear_current_pos();
extern 
void test_ident()
{
	tokens.clear();
	clear_current_pos();
	yy_scan_string("__var__ \nx \n_x_y_ \n_x0 \n_0_ \n0 \nX");
	yylex();
	cout << endl << "TEST IDENT : ";
	vector<base*> check;
	check.push_back(new ident("__var__", 0, 0, 6));
	check.push_back(new ident("x", 1, 0, 0));
	check.push_back(new ident("_x_y_", 2, 0, 4));
	check.push_back(new ident("_x0", 3, 0, 2));
	check.push_back(new ident("_0_", 4, 0, 2));
	check.push_back(new value("0", 5, 0, 0));
	check.push_back(new ident("X", 6, 0, 0));
	if (tokens.size() != check.size()) {
		cout << "NO" << endl;
		return;
	}
	for (int i = 0; i < check.size(); ++i) {
		if (tokens[i]->toString() != check[i]->toString()) {
			cout << "NO" << endl;
			cout << tokens[i]->toString() << endl << check[i]->toString() << endl;
			return;
		}
	}
	cout << "YES" << endl;
	
}

void test_comment() {
	tokens.clear();
	clear_current_pos();
	yy_scan_string("// write if else; \nwrite //Hello");
	yylex();
	cout << endl << "TEST COMMENT : ";
	vector<base*> check;
	check.push_back(new comment("// write if else; ", 0, 0, 17));
	check.push_back(new key_word(KW_WRITE, 1, 0, 4));
	check.push_back(new comment("//Hello", 1, 6, 6));
	if (tokens.size() != check.size()) {
		cout << "NO" << endl;
		return;
	}
	for (int i = 0; i < check.size(); ++i) {
		if (tokens[i]->toString() != check[i]->toString()) {
			cout << "NO" << endl;
			cout << tokens[i]->toString() << endl << check[i]->toString() << endl;
			return;
		}
	}
	cout << "YES" << endl;
}

void test_kw() {
	tokens.clear();
	clear_current_pos();
	yy_scan_string("write if else read begin end then while do");
	yylex();
	cout << endl << "TEST KEY_WORD : ";
	vector<base*> check;
	check.push_back(new key_word(KW_WRITE, 0, 0, 4));
	check.push_back(new key_word(KW_IF, 0, 6, 1));
	check.push_back(new key_word(KW_ELSE, 0, 9, 3));
	check.push_back(new key_word(KW_READ, 0, 14, 3));
	check.push_back(new key_word(KW_BEGIN, 0, 19, 4));
	check.push_back(new key_word(KW_END, 0, 25, 2));
	check.push_back(new key_word(KW_THEN, 0, 29, 3));
	check.push_back(new key_word(KW_WHILE, 0, 34, 4));
	check.push_back(new key_word(KW_DO, 0, 40, 1));
	if (tokens.size() != check.size()) {
		cout << "NO" << endl;
		return;
	}
	for (int i = 0; i < check.size(); ++i) {
		if (tokens[i]->toString() != check[i]->toString()) {
			cout << "NO" << endl;
			cout << tokens[i]->toString() << endl << check[i]->toString() << endl;
			return;
		}
	}
	cout << "YES" << endl;
}

void test_expr() {
	tokens.clear();
	clear_current_pos();
	yy_scan_string("read x; if y + 1 == x then write y else write x");
	yylex();
	cout << endl << "TEST EXPR : ";
	vector<base*> check;
	check.push_back(new key_word(KW_READ, 0, 0, 3));
	check.push_back(new ident("x", 0, 5, 0));
	check.push_back(new separator(0, 6, 0));
	check.push_back(new key_word(KW_IF, 0, 8, 1));
	check.push_back(new ident("y", 0, 11, 0));
	check.push_back(new op(ADD, 0, 13, 0));
	check.push_back(new value("1", 0, 15, 0));
	check.push_back(new op(EQ, 0, 17, 1));
	check.push_back(new ident("x", 0, 20, 0));
	check.push_back(new key_word(KW_THEN, 0, 22, 3));
	check.push_back(new key_word(KW_WRITE, 0, 27, 4));
	check.push_back(new ident("y", 0, 33, 0));
	check.push_back(new key_word(KW_ELSE, 0, 35, 3));
	check.push_back(new key_word(KW_WRITE, 0, 40, 4));
	check.push_back(new ident("x", 0, 46, 0));
	if (tokens.size() != check.size()) {
		cout << "NO" << endl;
		return;
	}
	for (int i = 0; i < check.size(); ++i) {
		if (tokens[i]->toString() != check[i]->toString()) {
			cout << "NO" << endl;
			cout << tokens[i]->toString() << endl << check[i]->toString() << endl;
			return;
		}
	}
	cout << "YES" << endl;
}
void test_op() {
	tokens.clear();
	clear_current_pos();
	yy_scan_string("+ - * / % == != > >= < <= && || ** :=");
	yylex();
	cout << endl << "TEST OPERATORS : ";
	vector<base*> check;
	check.push_back(new op(ADD, 0, 0, 0));
	check.push_back(new op(SUB, 0, 2, 0));
	check.push_back(new op(MUL, 0, 4, 0));
	check.push_back(new op(DIV, 0, 6, 0));
	check.push_back(new op(MOD, 0, 8, 0));
	check.push_back(new op(EQ, 0, 10, 1));
	check.push_back(new op(NE, 0, 13, 1));
	check.push_back(new op(G, 0, 16, 0));
	check.push_back(new op(GE, 0, 18, 1));
	check.push_back(new op(L, 0, 21, 0));
	check.push_back(new op(LE, 0, 23, 1));
	check.push_back(new op(AND, 0, 26, 1));
	check.push_back(new op(OR, 0, 29, 1));	
	check.push_back(new op(POW, 0, 32, 1));
	check.push_back(new op(ASSIGN, 0, 35, 1));
	if (tokens.size() != check.size()) {
		cout << "NO" << endl;
		return;
	}
	for (int i = 0; i < check.size(); ++i) {
		if (tokens[i]->toString() != check[i]->toString()) {
			cout << "NO" << endl;
			cout << tokens[i]->toString() << endl << check[i]->toString() << endl;
			return;
		}
	}
	cout << "YES" << endl;
}

void test_mlcomment()
{
	tokens.clear();
	clear_current_pos();
	yy_scan_string("(*Hello!)***Hi...*) (*He)(llo\nHi\n*) x:=1 (*Hello\n(*HI\n(*World!*)*)!!!*) (***(***)***)");
	yylex();
	cout << endl << "TEST ML_COMMENT : ";
	vector<base*> check;
	check.push_back(new mlcomment("(*Hello!)***Hi...*)"));
	check.push_back(new mlcomment("(*He)(llo Hi *)"));
	check.push_back(new ident("x", 2, 1, 0));
	check.push_back(new op(ASSIGN, 2, 2, 1));
	check.push_back(new value("1", 2, 4, 0));
	check.push_back(new mlcomment("(*Hello (*HI (*World!*)*)!!!*)"));
	check.push_back(new mlcomment("(***(***)***)"));
	if (tokens.size() != check.size()) {
		cout << "NO" << endl;
		return;
	}
	for (int i = 0; i < check.size(); ++i) {
		if (tokens[i]->toString() != check[i]->toString()) {
			cout << "NO" << endl;
			cout << tokens[i]->toString() << endl << check[i]->toString() << endl;
			return;
		}
	}
	cout << "YES" << endl;

}
void test()
{
	test_ident();
	test_comment();
	test_kw();
	test_op();
	test_expr();
	test_mlcomment();
}
#endif