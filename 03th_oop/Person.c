#include <stdio.h>

struct person {
	char *name;
	void (*print)(struct person *);
};

void print(struct person *p)
{
	printf("%s\n", p->name);
}

int main(int argc, char *argv[])
{
	struct person zhangsan = {
		.name = "张三",
		.print = print,
	};

	struct person lisi = {
		.name = "李四",
		.print = print,
	};
	print(&zhangsan);
	print(&lisi);
}
