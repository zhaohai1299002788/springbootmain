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
<div class="Box-body p-6">
        <article class="markdown-body entry-content" itemprop="text"><table>
<thead>
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
</li>
</ul>
<h3><a id="user-content-memo-后记" class="anchor" aria-hidden="true" href="#memo-后记"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a><g-emoji class="g-emoji" alias="memo" fallback-src="https://assets-cdn.github.com/images/icons/emoji/unicode/1f4dd.png">📝</g-emoji> 后记</h3>
<h4><a id="user-content-about" class="anchor" aria-hidden="true" href="#about"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>About</h4>
<p>本仓库主要是根据计算机经典书籍以及官方技术文档进行总结的学习笔记，希望对大家有所帮助。</p>
<p>学习笔记不是从网上到处拼凑而来，除了少部分引用书上和技术文档的原文，其余都是笔者的原创。在您引用本仓库内容或者对内容进行修改演绎时，请遵循文末的开源协议，谢谢。</p>
<h4><a id="user-content-booklist" class="anchor" aria-hidden="true" href="#booklist"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>BookList</h4>
<p>本仓库参考的书目：<a href="https://github.com/CyC2018/Interview-Notebook/blob/master/BOOKLIST.md">BOOKLIST</a>。</p>
<h4><a id="user-content-how-to-contribute" class="anchor" aria-hidden="true" href="#how-to-contribute"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>How To Contribute</h4>
<p>笔记内容是笔者一个字一个字打上去的，难免会有一些笔误，如果发现笔误可直接对相应文档进行编辑修改。</p>
<p>如果想要提交一个仓库现在还没有的全新内容，可以先将相应的文档放到 other 目录下。</p>
<p>欢迎在 Issue 中提交对本仓库的改进建议~</p>
<h4><a id="user-content-typesetting" class="anchor" aria-hidden="true" href="#typesetting"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Typesetting</h4>
<p>笔记内容按照 <a href="https://mazhuang.org/wiki/chinese-copywriting-guidelines/" rel="nofollow">中文文案排版指北</a> 进行排版，以保证内容的可读性。</p>
<p>笔记不使用 <code>![]()</code> 这种方式来引用图片，而是用 <code>&lt;img&gt;</code> 标签。一方面是为了能够控制图片以合适的大小显示，另一方面是因为 GFM 不支持 <code>&lt;center&gt; ![]() &lt;/center&gt;</code> 让图片居中显示，只能使用 <code>&lt;div align="center"&gt; &lt;img src=""/&gt; &lt;/div&gt;</code> 达到居中的效果。</p>
<p>笔者将自己实现的文档排版功能提取出来，放在 Github Page 中，无需下载安装即可免费使用：<a href="https://github.com/CyC2018/Markdown-Typesetting">Text-Typesetting</a>。</p>
<h4><a id="user-content-uploading" class="anchor" aria-hidden="true" href="#uploading"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Uploading</h4>
<p>笔者在本地使用为知笔记软件进行书写，为了方便将本地笔记内容上传到 Github 上，实现了一整套自动化上传方案，包括文本文件的导出、提取图片、Markdown 文档转换、Git 同步。</p>
<p>进行 Markdown 文档转换是因为 Github 使用的 GFM 不支持 MathJax 公式和 TOC 标记，所以需要替换 MathJax 公式为 CodeCogs 的云服务和重新生成 TOC 目录。</p>
<p>笔者将自己实现文档转换功能提取出来，方便大家在需要将本地 Markdown 上传到 Github，或者制作项目 README 文档时生成目录时使用：<a href="https://github.com/CyC2018/GFM-Converter">GFM-Converter</a>。</p>
<h4><a id="user-content-logo" class="anchor" aria-hidden="true" href="#logo"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Logo</h4>
<p>Power by <a href="https://logomakr.com/" rel="nofollow">logomakr</a>.</p>
<h4><a id="user-content-statement" class="anchor" aria-hidden="true" href="#statement"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Statement</h4>
<p>本仓库不参与商业行为，不向读者收取任何费用。(This repository is not engaging in business activities, and does not charge readers any fee.)</p>
<h4><a id="user-content-acknowledgements" class="anchor" aria-hidden="true" href="#acknowledgements"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Acknowledgements</h4>
<p>感谢以下人员对本仓库做出的贡献，当然不仅仅只有这些贡献者，这里就不一一列举了。如果你希望被添加到这个名单中，并且提交过 Issue 或者 PR，请与笔者联系。</p>
<a href="https://github.com/linw7">
​    <img src="https://avatars3.githubusercontent.com/u/21679154?s=400&amp;v=4" width="50px" style="max-width:100%;">
</a> 
<a href="https://github.com/g10guang">
​    <img src="https://avatars1.githubusercontent.com/u/18458140?s=400&amp;v=4" width="50px" style="max-width:100%;">
</a> 
<a href="https://github.com/ResolveWang">
​    <img src="https://avatars1.githubusercontent.com/u/8018776?s=400&amp;v=4" width="50px" style="max-width:100%;">
</a>
<a href="https://github.com/crossoverJie">
​    <img src="https://avatars1.githubusercontent.com/u/15684156?s=400&amp;v=4" width="50px" style="max-width:100%;">
</a> 
<a href="https://github.com/jy03078584">
​    <img src="https://avatars2.githubusercontent.com/u/7719370?s=400&amp;v=4" width="50px" style="max-width:100%;">
</a>
<a href="https://github.com/kwongtailau">
​    <img src="https://avatars0.githubusercontent.com/u/22954582?s=400&amp;v=4" width="50px" style="max-width:100%;">
</a>
<a href="https://github.com/xiangflight">
​    <img src="https://avatars2.githubusercontent.com/u/10072416?s=400&amp;v=4" width="50px" style="max-width:100%;">
</a>
<a href="https://github.com/mafulong">
​    <img src="https://avatars1.githubusercontent.com/u/24795000?s=400&amp;v=4" width="50px" style="max-width:100%;">
</a>
<h4><a id="user-content-license" class="anchor" aria-hidden="true" href="#license"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>License</h4>
<p>在对本作品进行演绎时，请署名并以相同方式共享。</p>
<p><a href="http://creativecommons.org/licenses/by-nc-sa/4.0/" rel="nofollow"><img alt="知识共享许可协议" src="https://camo.githubusercontent.com/6887feb0136db5156c4f4146e3dd2681d06d9c75/68747470733a2f2f692e6372656174697665636f6d6d6f6e732e6f72672f6c2f62792d6e632d73612f342e302f38387833312e706e67" data-canonical-src="https://i.creativecommons.org/l/by-nc-sa/4.0/88x31.png" style="max-width:100%;"></a></p>
</article>
      </div>
  </div>


  </div>
  <div class="modal-backdrop js-touch-events"></div>
</div>

    </div>
  </div>

  </div>

        
<div class="footer container-lg px-3" role="contentinfo">
  <div class="position-relative d-flex flex-justify-between pt-6 pb-2 mt-6 f6 text-gray border-top border-gray-light ">
    <ul class="list-style-none d-flex flex-wrap ">
      <li class="mr-3">&copy; 2018 <span title="0.80801s from unicorn-f7c4db794-4b7nq">GitHub</span>, Inc.</li>
        <li class="mr-3"><a data-ga-click="Footer, go to terms, text:terms" href="https://github.com/site/terms">Terms</a></li>
        <li class="mr-3"><a data-ga-click="Footer, go to privacy, text:privacy" href="https://github.com/site/privacy">Privacy</a></li>
        <li class="mr-3"><a href="https://help.github.com/articles/github-security/" data-ga-click="Footer, go to security, text:security">Security</a></li>
        <li class="mr-3"><a href="https://status.github.com/" data-ga-click="Footer, go to status, text:status">Status</a></li>
        <li><a data-ga-click="Footer, go to help, text:help" href="https://help.github.com">Help</a></li>
    </ul>

    <a aria-label="Homepage" title="GitHub" class="footer-octicon mr-lg-4" href="https://github.com">
      <svg height="24" class="octicon octicon-mark-github" viewBox="0 0 16 16" version="1.1" width="24" aria-hidden="true"><path fill-rule="evenodd" d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0 0 16 8c0-4.42-3.58-8-8-8z"/></svg>
</a>
   <ul class="list-style-none d-flex flex-wrap ">
        <li class="mr-3"><a data-ga-click="Footer, go to contact, text:contact" href="https://github.com/contact">Contact GitHub</a></li>
        <li class="mr-3"><a href="https://github.com/pricing" data-ga-click="Footer, go to Pricing, text:Pricing">Pricing</a></li>
      <li class="mr-3"><a href="https://developer.github.com" data-ga-click="Footer, go to api, text:api">API</a></li>
      <li class="mr-3"><a href="https://training.github.com" data-ga-click="Footer, go to training, text:training">Training</a></li>
        <li class="mr-3"><a href="https://blog.github.com" data-ga-click="Footer, go to blog, text:blog">Blog</a></li>
        <li><a data-ga-click="Footer, go to about, text:about" href="https://github.com/about">About</a></li>

    </ul>
  </div>
  <div class="d-flex flex-justify-center pb-6">
    <span class="f6 text-gray-light"></span>
  </div>
</div>



  <div id="ajax-error-message" class="ajax-error-message flash flash-error">
    <svg class="octicon octicon-alert" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M8.893 1.5c-.183-.31-.52-.5-.887-.5s-.703.19-.886.5L.138 13.499a.98.98 0 0 0 0 1.001c.193.31.53.501.886.501h13.964c.367 0 .704-.19.877-.5a1.03 1.03 0 0 0 .01-1.002L8.893 1.5zm.133 11.497H6.987v-2.003h2.039v2.003zm0-3.004H6.987V5.987h2.039v4.006z"/></svg>
    <button type="button" class="flash-close js-ajax-error-dismiss" aria-label="Dismiss error">
      <svg class="octicon octicon-x" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48L7.48 8z"/></svg>
    </button>
    You can’t perform that action at this time.
  </div>


    
    <script crossorigin="anonymous" integrity="sha512-SioIN4O2tZpqT7tQBS8bzPWdxxS+N5o+rdhOMb7XHPtnOax8ZjYeTAfCBuM1mo1VBV1VmdWVOnwiu+YueNnuBg==" type="application/javascript" src="https://assets-cdn.github.com/assets/frameworks-91a27bb38467ca960cb485040d1c5dce.js"></script>
    
    <script crossorigin="anonymous" async="async" integrity="sha512-7d7Y/QktEGu5ULYe3K9qOeCa2f2V6rAsDzmxgJ903Iy2JJLDWLmiLMGiQRgP1ElPUkkAh6yoNcwbaHm1gUENxQ==" type="application/javascript" src="https://assets-cdn.github.com/assets/github-21c55a72d350b2879dfb5264f7dcc9d4.js"></script>
    
    
    
  <div class="js-stale-session-flash stale-session-flash flash flash-warn flash-banner d-none">
    <svg class="octicon octicon-alert" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M8.893 1.5c-.183-.31-.52-.5-.887-.5s-.703.19-.886.5L.138 13.499a.98.98 0 0 0 0 1.001c.193.31.53.501.886.501h13.964c.367 0 .704-.19.877-.5a1.03 1.03 0 0 0 .01-1.002L8.893 1.5zm.133 11.497H6.987v-2.003h2.039v2.003zm0-3.004H6.987V5.987h2.039v4.006z"/></svg>
    <span class="signed-in-tab-flash">You signed in with another tab or window. <a href="">Reload</a> to refresh your session.</span>
    <span class="signed-out-tab-flash">You signed out in another tab or window. <a href="">Reload</a> to refresh your session.</span>
  </div>
  <div class="facebox" id="facebox" style="display:none;">
  <div class="facebox-popup">
    <div class="facebox-content" role="dialog" aria-labelledby="facebox-header" aria-describedby="facebox-description">
    </div>
    <button type="button" class="facebox-close js-facebox-close" aria-label="Close modal">
      <svg class="octicon octicon-x" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48L7.48 8z"/></svg>
    </button>
  </div>
</div>

  <template id="site-details-dialog">
  <details class="details-reset details-overlay details-overlay-dark lh-default text-gray-dark" open>
    <summary aria-haspopup="dialog" aria-label="Close dialog"></summary>
    <details-dialog class="Box Box--overlay d-flex flex-column anim-fade-in fast">
      <button class="Box-btn-octicon m-0 btn-octicon position-absolute right-0 top-0" type="button" aria-label="Close dialog" data-close-dialog>
        <svg class="octicon octicon-x" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48L7.48 8z"/></svg>
      </button>
      <div class="octocat-spinner my-6 js-details-dialog-spinner"></div>
    </details-dialog>
  </details>
</template>

  <div class="Popover js-hovercard-content position-absolute" style="display: none; outline: none;" tabindex="0">
  <div class="Popover-message Popover-message--bottom-left Popover-message--large Box box-shadow-large" style="width:360px;">
  </div>
</div>

<div id="hovercard-aria-description" class="sr-only">
  Press h to open a hovercard with more details.
</div>
