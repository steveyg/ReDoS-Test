# ReDoSTest
A program can test the effectiveness of Regular Expressions

##RoDoS是什么
正则表达式拒绝服务攻击（ReDos）是未来可能的 DoS 演变方向之一，研究表明，编写不严谨的正则表达式可能会受到攻击，以致计算相对较短的攻击字符串（少于 50 个字符）需要数小时或更长时间。在最坏的情况下，处理时间实际上相当于输入字符串中字符数的幂数，这意味着，向字符串中增加一个字符串就会使处理时间翻倍。因此，当处理时间非常长的时候，便有可能造成DoS，影响服务的正常使用。

##检测方法
通过模糊测试的方式，检测正则表达式的效率，如果匹配的时间过长，则说明该正则表达式存在缺陷。

##使用说明
在Config.java中设置参数

```java
    //设置正则表达式
    public static String REGEX = "[A-Z]{1,}\\-[0-9]{1,}";
    
    //设置模糊测试生成的字符串的最大长度
    public static int STR_LENGTH = 100;
    
    //设置测试数量
    public static int TEST_COUNT = 100000000;
    
    //设置模糊查询生成的字符串中所包含的内容
    public static char[] CHARACTER = new char[]{
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9','-','_'
    };

    //手动添加测试用例
    public static String[] TEST_CASE = {
       "aaaaaaaaaaaaaaaaaaaaaaaaaaa3",
       "aaaaaa"
    };
```
[参考资料](https://msdn.microsoft.com/zh-cn/magazine/ff646973.aspx)
