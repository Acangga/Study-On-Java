# Git学习笔记

## 一、Introduction to Git

### 安装git

在Windows上使用Git，可以从Git官网直接[下载安装程序](https://git-scm.com/downloads)，（网速慢的同学请移步[国内镜像](https://pan.baidu.com/s/1kU5OCOB#list/path=%2Fpub%2Fgit)），然后按默认选项安装即可。

安装完成后，在开始菜单里找到“Git”->“Git Bash”，蹦出一个类似命令行窗口的东西，就说明Git安装成功！

安装完成后，还需要最后一步设置，在命令行输入：

```bash
$ git config --global user.name "Your Name"
$ git config --global user.email "email@example.com"
```

### 创建版本库

版本库又名仓库，英文名**repository**，你可以简单理解成一个目录，这个目录里面的所有文件都可以被Git管理起来，每个文件的修改、删除，Git都能跟踪，以便任何时刻都可以追踪历史，或者在将来某个时刻可以“还原”。

#### Step 1：

**注：**windows系统中请确保目录名称不包含中文，以免遇到各种莫名其妙的问题。

```bash
$ mkdir learngit
$ cd learngit
$ pwd
/Users/michael/learngit
```

pwd：显示当前目录

#### Step2:

通过`git init`命令把这个目录变成Git可以管理的仓库：

```bash
$ git init
Initialized empty Git repository in /Users/michael/learngit/.git/
```

初始化之后，版本库中多了一个隐藏的.git目录（用ls -ah命令可见），这个目录是git用来跟踪管理版本库的，请不要随意编辑里面的文件，以免版本库遭到破坏。

#### Step3:

现在我们编写一个`readme.txt`文件，内容随意，并放到repository目录下，以免git找不到它。

第一步，用命令`git add`告诉Git，把文件添加到仓库：

```bash
$ git add readme.txt
```

执行命令后没有显示任何信息说明添加成功，Unix哲学之”没有消息就是好消息“。

第二步，用命令`git commit`告诉Git，把文件提交到仓库：

```bash
$ git commit -m "wrote a readme file"
[master (root-commit) eaadf4e] wrote a readme file
 1 file changed, 2 insertions(+)
 create mode 100644 readme.txt
```

简单解释一下`git commit`命令，`-m`后面输入的是本次提交的说明，可以输入任意内容，当然最好是有意义的，这样你就能从历史记录里方便地找到改动记录。

`git commit`命令执行成功后会告诉你，`1 file changed`：1个文件被改动（我们新添加的readme.txt文件）；`2 insertions`：插入了两行内容（readme.txt有两行内容）。

**为什么Git添加文件需要`add`，`commit`一共两步呢？**因为`commit`可以一次提交很多文件，所以你可以多次`add`不同的文件，比如：

```bash
$ git add file1.txt
$ git add file2.txt file3.txt
$ git commit -m "add 3 files."
```



## 二、时光穿梭

## 三、远程仓库

实际情况往往是这样，找一台电脑充当服务器的角色，每天24小时开机，其他每个人都从这个“服务器”仓库克隆一份到自己的电脑上，并且各自把各自的提交推送到服务器仓库里，也从服务器仓库中拉取别人的提交。

完全可以自己搭建一台运行Git的服务器，不过现阶段，为了学Git先搭个服务器绝对是小题大作。好在这个世界上有个叫[GitHub](https://github.com/)的神奇的网站，从名字就可以看出，这个网站就是提供Git仓库托管服务的，所以，只要注册一个GitHub账号，就可以免费获得Git远程仓库。

在继续阅读后续内容前，请自行注册GitHub账号。由于你的本地Git仓库和GitHub仓库之间的传输是通过SSH加密的，所以，需要一点设置：

第1步：创建SSH Key。在用户主目录（C:\Users\myclm\.ssh）下，看看有没有.ssh目录，如果有，再看看这个目录下有没有`id_rsa`和`id_rsa.pub`这两个文件，如果已经有了，可直接跳到下一步。如果没有，打开Shell（Windows下打开Git Bash），创建SSH Key：

```bash
$ ssh-keygen -t rsa -C "youremail@example.com"
```

你需要把邮件地址换成你自己的邮件地址，然后一路回车，使用默认值即可，由于这个Key也不是用于军事目的，所以也无需设置密码。

如果一切顺利的话，可以在用户主目录里找到`.ssh`目录，里面有`id_rsa`和`id_rsa.pub`两个文件，这两个就是SSH Key的秘钥对，`id_rsa`是私钥，不能泄露出去，`id_rsa.pub`是公钥，可以放心地告诉任何人。

第2步：登陆GitHub，打开“Account settings”，“SSH Keys”页面：

然后，点“Add SSH Key”，填上任意Title，在Key文本框里粘贴`id_rsa.pub`文件的内容。

（id_rsa.pub`文件用记事本打开即可。）

为什么GitHub需要SSH Key呢？因为GitHub需要识别出你推送的提交确实是你推送的，而不是别人冒充的，而Git支持SSH协议，所以，GitHub只要知道了你的公钥，就可以确认只有你自己才能推送。

当然，GitHub允许你添加多个Key。假定你有若干电脑，你一会儿在公司提交，一会儿在家里提交，只要把每台电脑的Key都添加到GitHub，就可以在每台电脑上往GitHub推送了。

最后友情提示，在GitHub上免费托管的Git仓库，任何人都可以看到喔（但只有你自己才能改）。所以，不要把敏感信息放进去。

### 添加远程库

现在的情景是，你已经在本地创建了一个Git仓库后，又想在GitHub创建一个Git仓库，并且让这两个仓库进行远程同步，这样，GitHub上的仓库既可以作为备份，又可以让其他人通过该仓库来协作，真是一举多得。

#### Step1

首先，登陆GitHub，然后，在右上角找到“Create a new repo”按钮，创建一个新的仓库。

在Repository name填入`repository name`，其他保持默认设置，点击“Create repository”按钮，就成功地创建了一个新的Git仓库。

#### Step2

目前，在GitHub上的这个`learngit`仓库还是空的，GitHub告诉我们，可以从这个仓库克隆出新的仓库，也可以把一个已有的本地仓库与之**关联**，然后，把本地仓库的内容推送到GitHub仓库。我们选用的是SSH。

现在，我们根据GitHub的提示，在本地的`learngit`仓库下运行命令：

```bash
git remote add origin git@github.com:yourname/yourreponame.git
```

添加后，远程库的名字就是`origin`，这是Git默认的叫法，也可以改成别的，但是`origin`这个名字一看就知道是远程库。

如果出现

```bash
fatal: remote origin already exists. 
```

解决方法：这时因为已经有名叫origin的远程库存在了，所以应该有三种方法：

1.给现在想要建立的远程库改个名。

2.要么把原来的叫origin的远程库删了。

3.直接往原来的叫origin的远程库里push。

我们选用了方法2.

```bash
$ git remote rm origin
```

如果执行 git remote rm origin 报错的话，我们可以手动修改gitconfig文件的内容

```bash
$ vi .git/config
```

![这里写图片描述](Git学习笔记.assets/20151222174818358)

把 [remote “origin”] 那一行删掉就好了

#### Step3

如果你之前没有提交过文件,而你在git push的时候出现：

```
error: src refspec master does not match any.
error: failed to push some refs to 'git@github.com:hahaha/ftpmanage.git'
```

或者

```bash
Everything up-to-date
```



并且文件也没有提交上去.可能是因为你没有git add 和 git commit。

需要重新执行：

```bash
git add .
git commit -m "message"
git push origin master
```



然后再执行

```bash
$ git push -u origin master
Counting objects: 20, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (15/15), done.
Writing objects: 100% (20/20), 1.64 KiB | 560.00 KiB/s, done.
Total 20 (delta 5), reused 0 (delta 0)
remote: Resolving deltas: 100% (5/5), done.
To github.com:michaelliao/learngit.git
 * [new branch]      master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'
```

如果出现

```bash
$ git push -u origin master
Warning: Permanently added the RSA host key for IP address 'xx.xx.xxx.xxx' to the list of known hosts.
To git@github.com:hahaha/ftpmanage.git
 ! [rejected]        master -> master (fetch first)
error: failed to push some refs to 'git@github.com:hahahah/ftpmanage.git'
hint: Updates were rejected because the remote contains work that you do
hint: not have locally. This is usually caused by another repository pushing
hint: to the same ref. You may want to first integrate the remote changes
hint: (e.g., 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.
```

hint提示我们integrate the remote changes (e.g., 'git pull ...') before pushing again.

所以我们执行

```bash
$ git pull --rebase origin master
warning: no common commits
remote: Counting objects: 3, done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (3/3), done.
From github.com:hahah/ftpmanage
 * branch            master     -> FETCH_HEAD
 * [new branch]      master     -> origin/master
First, rewinding head to replay your work on top of it...
Applying: init files
```

再push

```bash
$ git push -u origin master
Counting objects: 10, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (10/10), done.
Writing objects: 100% (10/10), 5.15 KiB | 0 bytes/s, done.
Total 10 (delta 3), reused 0 (delta 0)
To git@github.com:hahaha/ftpmanage.git
   a2b5c30..1044f15  master -> master
Branch master set up to track remote branch master from origin.
```

**成功！**