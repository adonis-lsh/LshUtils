# LshUtils
对commons-lang3-3.6做一个更改包名的操作
在正常的项目中引用commons-lang3-3.6中的ObjectUtils时,在小米5的机器中,会出现以下错误,原因可以大致看出是因为小米rom的framework中也引用了相应的库,导致报错,解决方法就是让小米改一下包名或者我们改一下包名,可是小米又不是我们能控制的,所以对它们所犯的错误,我们当然是选择原谅它了,所以我把commons-lang3-3.6源码改了一下包名有上传到了jcenter,方便大家使用.
![](http://opgkgu3ek.bkt.clouddn.com/17-10-23/90715029.jpg)
在项目中添加:
compile 'com.lsh:utils:0.0.1'
