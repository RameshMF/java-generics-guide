<div dir="ltr" style="text-align: left;" trbidi="on">
<h2 style="text-align: left;">
<div class="separator" style="clear: both; text-align: center;">
<a href="https://1.bp.blogspot.com/-_yYj47VKFSE/W3kucNVtTDI/AAAAAAAADQo/3X3p2H-u3fY1x7D7iDf1zNNd75SN8lxWQCLcBGAs/s1600/java-generics-guide.png" imageanchor="1" style="margin-left: 1em; margin-right: 1em;"><img border="0" data-original-height="280" data-original-width="383" height="233" src="https://1.bp.blogspot.com/-_yYj47VKFSE/W3kucNVtTDI/AAAAAAAADQo/3X3p2H-u3fY1x7D7iDf1zNNd75SN8lxWQCLcBGAs/s320/java-generics-guide.png" width="320"></a></div>
<div style="text-align: left;">
<span style="font-family: &quot;verdana&quot; , sans-serif;"><span style="background-color: white; color: #24292e; font-size: 16px; font-weight: 400;">Generics were added in Java 5 to provide compile-time type checking and removing the risk of&nbsp;</span><em style="background-color: white; box-sizing: border-box; color: #24292e; font-size: 16px; font-weight: 400;">ClassCastException</em><span style="background-color: white; color: #24292e; font-size: 16px; font-weight: 400;">&nbsp;that was common while working with collection classes.</span></span></div>
<div style="text-align: left;">
<span style="background-color: white; color: #24292e; font-size: 16px; font-weight: 400;"><span style="font-family: &quot;verdana&quot; , sans-serif;"><br></span></span></div>
<span style="font-family: &quot;verdana&quot; , sans-serif;">Java Generics Guide</span></h2>
<a href="http://www.javaguides.net/2018/08/java-generics-guide.html" target="_blank"><span style="font-family: &quot;verdana&quot; , sans-serif;">Java Generics - Generics Basics</span></a><br>
<div>
<a href="http://www.javaguides.net/2018/08/java-generics-guide.html#benefits-of-generics" target="_blank"><span style="font-family: &quot;verdana&quot; , sans-serif;">Java Generics - Benefits of Generics</span></a></div>
<div>
<a href="http://www.javaguides.net/2018/08/java-generics-guide.html#generic-types" target="_blank"><span style="font-family: &quot;verdana&quot; , sans-serif;">Java Generics - Generic Types</span></a></div>
<div>
<a href="http://www.javaguides.net/2018/08/generics-methods-in-java.html" target="_blank"><span style="font-family: &quot;verdana&quot; , sans-serif;">Java Generics - Generic Methods in Java</span></a></div>
<div>
<a href="http://www.javaguides.net/2018/08/java-generics-bounded-type-parameters.html" target="_blank"><span style="font-family: &quot;verdana&quot; , sans-serif;">Java Generics - Bounded Type Parameters</span></a></div>
<div>
<a href="http://www.javaguides.net/2018/08/java-generics-wildcards.html" target="_blank"><span style="font-family: &quot;verdana&quot; , sans-serif;">Java Generics - Wildcards</span></a></div>
<h2 style="text-align: left;">
<span style="font-family: &quot;verdana&quot; , sans-serif;">Java Generics Examples</span></h2>
<div>
<span style="font-family: &quot;verdana&quot; , sans-serif;"><a href="http://www.javaguides.net/2018/08/java-generic-methods-examples.html" target="_blank">Java Generic Methods Examples</a></span><br>
<span style="font-family: &quot;verdana&quot; , sans-serif;"><a href="http://www.javaguides.net/2018/08/java-generic-interface-examples.html" target="_blank">Java Generic Interface Examples</a></span><br>
<span style="font-family: &quot;verdana&quot; , sans-serif;"><a href="http://www.javaguides.net/2018/08/java-generic-class-examples.html" target="_blank">Java Generic Class Examples</a></span><br>
<a href="http://www.javaguides.net/2018/08/java-generics-multiple-type-parameters-example.html" target="_blank"><span style="font-family: &quot;verdana&quot; , sans-serif;">Java Generics Multiple Type Parameters Example</span></a></div>
<div>
<span style="font-family: Verdana, sans-serif;"><a href="http://www.javaguides.net/2018/08/java-generics-wildcards-example.html" target="_blank">Java Generics Wildcards Example</a></span><br>
<span style="font-family: Verdana, sans-serif;"><a href="http://www.javaguides.net/2018/08/java-generics-upper-bounded-wildcards.html" target="_blank">Java Generics Upper Bounded Wildcards Example</a></span><br>
<a href="http://www.javaguides.net/2018/08/java-generics-lower-bounded-wildcards.html" target="_blank"><span style="font-family: Verdana, sans-serif;">Java Generics Lower Bounded Wildcards Example</span></a></div>
</div>

SINCE Java 5, generics have been a part of the language. Before generics, you had to cast every object you read from a collection. If someone accidentally inserted an object of the wrong type, casts could fail at runtime. With generics, you tell the compiler what types of objects are permitted in each collection. The compiler inserts casts for you automatically and tells you at compile time if you try to insert an object of the wrong type. This results in programs that are both safer and clearer, but these benefits, which are not limited to collections, come at a price. This chapter tells you how to maximize the benefits and minimize the complications.
