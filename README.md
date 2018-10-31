# springbootmain
# 技术选型
    # 分布式框架SpringBoot  
    # 服务治理 : SpringCloud(负载均衡,断路器,集群)
    # Web : SpringMVC
    # Dao : Mybatis,Druid(监控)(MyBatis-Plus)
    # 前端 : 待定Vue框架
    # 单元测试 : Junit+Mock+代码覆盖率
    # 日志 : Slf4j+logbcak+moskito(日志监控)
    # 分布式锁 : 提供maven坐标(redis和zookeeper实现)
    # 分布式事务 : LCN和EasyTransaction
    # 数据库 : MySQL
    # 分布式ID : snowflake方案(UidGenerator 由百度开发，是Java实现的, 基于 Snowflake算法的唯一ID生成器),美团Leaf
    # 自动化构建和测试：Maven,Jenkins
    # 容器平台：Docker
    # 消息队列：Kafka,RocketMQ
    # 搜索 : ES
    # 分库分表 : MyCat,DBProxy,Sharding-JDBC 360
<tr>
<th align="center">Ⅰ</th>
<th align="center">Ⅱ</th>
<th align="center">Ⅲ</th>
<th align="center">Ⅳ</th>
<th align="center">Ⅴ</th>
<th align="center">Ⅵ</th>
<th align="center">Ⅶ</th>
<th align="center">Ⅷ</th>
<th align="center">Ⅸ</th>
<th align="center">Ⅹ</th>
</tr>
</thead>
<tbody>
<tr>
<td align="center">算法<a href="#pencil2-%E7%AE%97%E6%B3%95"><g-emoji class="g-emoji" alias="pencil2" fallback-src="https://assets-cdn.github.com/images/icons/emoji/unicode/270f.png">✏️</g-emoji></a></td>
<td align="center">操作系统<a href="#computer-%E6%93%8D%E4%BD%9C%E7%B3%BB%E7%BB%9F"><g-emoji class="g-emoji" alias="computer" fallback-src="https://assets-cdn.github.com/images/icons/emoji/unicode/1f4bb.png">💻</g-emoji></a></td>
<td align="center">网络<a href="#cloud-%E7%BD%91%E7%BB%9C"><g-emoji class="g-emoji" alias="cloud" fallback-src="https://assets-cdn.github.com/images/icons/emoji/unicode/2601.png">☁️</g-emoji></a></td>
<td align="center">面向对象<a href="#couple-%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1"><g-emoji class="g-emoji" alias="couple" fallback-src="https://assets-cdn.github.com/images/icons/emoji/unicode/1f46b.png">👫</g-emoji></a></td>
<td align="center">数据库<a href="#floppy_disk-%E6%95%B0%E6%8D%AE%E5%BA%93"><g-emoji class="g-emoji" alias="floppy_disk" fallback-src="https://assets-cdn.github.com/images/icons/emoji/unicode/1f4be.png">💾</g-emoji></a></td>
<td align="center">Java <a href="#coffee-java"><g-emoji class="g-emoji" alias="coffee" fallback-src="https://assets-cdn.github.com/images/icons/emoji/unicode/2615.png">☕️</g-emoji></a></td>
<td align="center">系统设计<a href="#bulb-%E7%B3%BB%E7%BB%9F%E8%AE%BE%E8%AE%A1"><g-emoji class="g-emoji" alias="bulb" fallback-src="https://assets-cdn.github.com/images/icons/emoji/unicode/1f4a1.png">💡</g-emoji></a></td>
<td align="center">工具<a href="#hammer-%E5%B7%A5%E5%85%B7"><g-emoji class="g-emoji" alias="hammer" fallback-src="https://assets-cdn.github.com/images/icons/emoji/unicode/1f528.png">🔨</g-emoji></a></td>
<td align="center">编码实践<a href="#speak_no_evil-%E7%BC%96%E7%A0%81%E5%AE%9E%E8%B7%B5"><g-emoji class="g-emoji" alias="speak_no_evil" fallback-src="https://assets-cdn.github.com/images/icons/emoji/unicode/1f64a.png">🙊</g-emoji></a></td>
<td align="center">后记<a href="#memo-%E5%90%8E%E8%AE%B0"><g-emoji class="g-emoji" alias="memo" fallback-src="https://assets-cdn.github.com/images/icons/emoji/unicode/1f4dd.png">📝</g-emoji></a></td>
</tr>
</tbody>
</table>
<br>
<div align="center">
    <a target="_blank" rel="noopener noreferrer" href="/CyC2018/CS-Notes/blob/master/other/LogoMakr_0zpEzN.png"><img src="/CyC2018/CS-Notes/raw/master/other/LogoMakr_0zpEzN.png" width="150px" style="max-width:100%;"></a>
    <br>
    <a href="/CyC2018/CS-Notes/blob/master/other/Group.md"> <img src="https://camo.githubusercontent.com/b2064ac4e4d126ac9d7aaaf1e9f75c2130260a1f/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f3e2d67726f75702d3461623861312e737667" data-canonical-src="https://img.shields.io/badge/&gt;-group-4ab8a1.svg" style="max-width:100%;"></a> <a href="https://legacy.gitbook.com/book/cyc2018/interview-notebook/details" rel="nofollow"> <img src="https://camo.githubusercontent.com/667b5bb120c75229d337587e21034c352a6bb9e1/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f5f2d676974626f6f6b2d3461623861312e737667" data-canonical-src="https://img.shields.io/badge/_-gitbook-4ab8a1.svg" style="max-width:100%;"></a> 
</div>
<h3><a id="user-content-pencil2-算法" class="anchor" aria-hidden="true" href="#pencil2-算法"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a><g-emoji class="g-emoji" alias="pencil2" fallback-src="https://assets-cdn.github.com/images/icons/emoji/unicode/270f.png">✏️</g-emoji> 算法</h3>
<ul>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/%E5%89%91%E6%8C%87%20offer%20%E9%A2%98%E8%A7%A3.md">剑指 Offer 题解</a></p>
<p>目录根据原书第二版进行编排，代码和原书有所不同，尽量比原书更简洁。</p>
</li>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/Leetcode%20%E9%A2%98%E8%A7%A3.md">Leetcode 题解</a></p>
<p>对题目做了一个大致分类，并对每种题型的解题思路做了总结。</p>
</li>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/%E7%AE%97%E6%B3%95.md">算法</a></p>
<p>排序、并查集、栈和队列、红黑树、散列表。</p>
</li>
</ul>
<h3><a id="user-content-computer-操作系统" class="anchor" aria-hidden="true" href="#computer-操作系统"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a><g-emoji class="g-emoji" alias="computer" fallback-src="https://assets-cdn.github.com/images/icons/emoji/unicode/1f4bb.png">💻</g-emoji> 操作系统</h3>
<ul>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/%E8%AE%A1%E7%AE%97%E6%9C%BA%E6%93%8D%E4%BD%9C%E7%B3%BB%E7%BB%9F.md">计算机操作系统</a></p>
<p>进程管理、内存管理、设备管理、链接。</p>
</li>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/Linux.md">Linux</a></p>
<p>基本实现原理以及基本操作。</p>
</li>
</ul>
<h3><a id="user-content-cloud-网络" class="anchor" aria-hidden="true" href="#cloud-网络"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a><g-emoji class="g-emoji" alias="cloud" fallback-src="https://assets-cdn.github.com/images/icons/emoji/unicode/2601.png">☁️</g-emoji> 网络</h3>
<ul>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/%E8%AE%A1%E7%AE%97%E6%9C%BA%E7%BD%91%E7%BB%9C.md">计算机网络</a></p>
<p>物理层、链路层、网络层、运输层、应用层。</p>
</li>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/HTTP.md">HTTP</a></p>
<p>方法、状态码、Cookie、缓存、连接管理、HTTPs、HTTP 2.0。</p>
</li>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/Socket.md">Socket</a></p>
<p>I/O 模型、I/O 多路复用。</p>
</li>
</ul>
<h3><a id="user-content-couple-面向对象" class="anchor" aria-hidden="true" href="#couple-面向对象"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a><g-emoji class="g-emoji" alias="couple" fallback-src="https://assets-cdn.github.com/images/icons/emoji/unicode/1f46b.png">👫</g-emoji> 面向对象</h3>
<ul>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F.md">设计模式</a></p>
<p>实现了 Gof 的 23 种设计模式。</p>
</li>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E6%80%9D%E6%83%B3.md">面向对象思想</a></p>
<p>三大原则（继承、封装、多态）、类图、设计原则。</p>
</li>
</ul>
<h3><a id="user-content-floppy_disk-数据库" class="anchor" aria-hidden="true" href="#floppy_disk-数据库"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a><g-emoji class="g-emoji" alias="floppy_disk" fallback-src="https://assets-cdn.github.com/images/icons/emoji/unicode/1f4be.png">💾</g-emoji> 数据库</h3>
<ul>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/%E6%95%B0%E6%8D%AE%E5%BA%93%E7%B3%BB%E7%BB%9F%E5%8E%9F%E7%90%86.md">数据库系统原理</a></p>
<p>事务、锁、隔离级别、MVCC、间隙锁、范式。</p>
</li>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/SQL.md">SQL</a></p>
<p>SQL 基本语法。</p>
</li>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/Leetcode-Database%20%E9%A2%98%E8%A7%A3.md">Leetcode-Database 题解</a></p>
<p>Leetcode 上数据库题目的解题记录。</p>
</li>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/MySQL.md">MySQL</a></p>
<p>存储引擎、索引、查询优化、切分、复制。</p>
</li>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/Redis.md">Redis</a></p>
<p>五种数据类型、字典和跳跃表数据结构、使用场景、和 Memcache 的比较、淘汰策略、持久化、文件事件的 Reactor 模式、复制。</p>
</li>
</ul>
<h3><a id="user-content-coffee-java" class="anchor" aria-hidden="true" href="#coffee-java"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a><g-emoji class="g-emoji" alias="coffee" fallback-src="https://assets-cdn.github.com/images/icons/emoji/unicode/2615.png">☕️</g-emoji> Java</h3>
<ul>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/Java%20%E5%9F%BA%E7%A1%80.md">Java 基础</a></p>
<p>不会涉及很多基本语法介绍，主要是一些实现原理以及关键特性。</p>
</li>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/Java%20%E5%AE%B9%E5%99%A8.md">Java 容器</a></p>
<p>源码分析：ArrayList、Vector、CopyOnWriteArrayList、LinkedList、HashMap、ConcurrentHashMap、LinkedHashMap、WeekHashMap。</p>
</li>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/Java%20%E5%B9%B6%E5%8F%91.md">Java 并发</a></p>
<p>线程使用方式、两种互斥同步方法、线程协作、JUC、线程安全、内存模型、锁优化。</p>
</li>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/Java%20%E8%99%9A%E6%8B%9F%E6%9C%BA.md">Java 虚拟机</a></p>
<p>运行时数据区域、垃圾收集、类加载。</p>
</li>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/Java%20IO.md">Java I/O</a></p>
<p>NIO 的原理以及实例。</p>
</li>
</ul>
<h3><a id="user-content-bulb-系统设计" class="anchor" aria-hidden="true" href="#bulb-系统设计"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a><g-emoji class="g-emoji" alias="bulb" fallback-src="https://assets-cdn.github.com/images/icons/emoji/unicode/1f4a1.png">💡</g-emoji> 系统设计</h3>
<ul>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/%E7%B3%BB%E7%BB%9F%E8%AE%BE%E8%AE%A1%E5%9F%BA%E7%A1%80.md">系统设计基础</a></p>
<p>性能、伸缩性、扩展性、可用性、安全性</p>
</li>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/%E5%88%86%E5%B8%83%E5%BC%8F.md">分布式</a></p>
<p>分布式锁、分布式事务、CAP、BASE、Paxos、Raft</p>
</li>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/%E9%9B%86%E7%BE%A4.md">集群</a></p>
<p>负载均衡、Session 管理</p>
</li>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/%E6%94%BB%E5%87%BB%E6%8A%80%E6%9C%AF.md">攻击技术</a></p>
<p>XSS、CSRF、SQL 注入、DDoS</p>
</li>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/%E7%BC%93%E5%AD%98.md">缓存</a></p>
<p>缓存特征、缓存位置、缓存问题、数据分布、一致性哈希、LRU、CDN</p>
</li>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/%E6%B6%88%E6%81%AF%E9%98%9F%E5%88%97.md">消息队列</a></p>
<p>消息处理模型、使用场景、可靠性</p>
</li>
</ul>
<h3><a id="user-content-hammer-工具" class="anchor" aria-hidden="true" href="#hammer-工具"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a><g-emoji class="g-emoji" alias="hammer" fallback-src="https://assets-cdn.github.com/images/icons/emoji/unicode/1f528.png">🔨</g-emoji> 工具</h3>
<ul>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/Git.md">Git</a></p>
<p>一些 Git 的使用和概念。</p>
</li>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/Docker.md">Docker</a></p>
<p>Docker 基本原理。</p>
</li>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/%E6%AD%A3%E5%88%99%E8%A1%A8%E8%BE%BE%E5%BC%8F.md">正则表达式</a></p>
<p>正则表达式基本语法。</p>
</li>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/%E6%9E%84%E5%BB%BA%E5%B7%A5%E5%85%B7.md">构建工具</a></p>
<p>构建工具的基本概念、主流构建工具介绍。</p>
</li>
</ul>
<h3><a id="user-content-speak_no_evil-编码实践" class="anchor" aria-hidden="true" href="#speak_no_evil-编码实践"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a><g-emoji class="g-emoji" alias="speak_no_evil" fallback-src="https://assets-cdn.github.com/images/icons/emoji/unicode/1f64a.png">🙊</g-emoji> 编码实践</h3>
<ul>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/%E9%87%8D%E6%9E%84.md">重构</a></p>
<p>参考 重构 改善既有代码的设计。</p>
</li>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/%E4%BB%A3%E7%A0%81%E5%8F%AF%E8%AF%BB%E6%80%A7.md">代码可读性</a></p>
<p>参考 编写可读代码的艺术。</p>
</li>
<li>
<p><a href="https://github.com/CyC2018/InnterviewNotes/blob/master/notes/%E4%BB%A3%E7%A0%81%E9%A3%8E%E6%A0%BC%E8%A7%84%E8%8C%83.md">代码风格规范</a></p>
<p>Google 开源项目的代码风格规范。</p>
