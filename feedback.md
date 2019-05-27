# Assignment Two Feedback

## Group  tue11g
## Group members: "u5828619","Osborne","Brodie","","u6718946","Shen","Jesse","","u6801714","Dai","Jiamin"

## Tutor Comment

Hi Jesse, Jiamin and Brodie. 
You have done a good job to progress to the final stages of the assignment
and I can see that you have put a solid effort into the assignment. I have 
some suggestions on how you can improve your submissions for the future. 
Unfortunately, while your GUI showed some basic functionality, the lack 
of instructions, visual guide or explanations made it difficult to play. It
took me a while to work out how to operate it, particularly because as you
drag a piece it doesn't show the piece dragging. You also can't rotate 
the pieces properly on my computer - I think the mouse is too sensitive. 
This makes me suspect that you did not properly test the assignment on the lab 
computers. Regardless, the GUI crashes if you press the reset button. You need
to show pride and care in your work by tying up loose ends! This is further 
reflected in the inclusion of various old, abandoned code segments scattered
throughout the code. Take pride in the beauty and functionality of the code you
write. I notice that the class structure is a little strange, you should keep 
separation between GUI and non GUI elements (e.g. in the Board class). I would
like to see more comments and unit tests in the future. I would also like to see 
you challenging yourself by avoiding the hard coding of things like rotations. 
You should also endeavour to improve your overall design before initiating coding. 
This means focussing on generating a solid heirarchical class structure. The design
is the single most important thing in the whole of software. 
Great work on the progress you made, hopefully I have given you some food for thought 
on how you can improve your work in the future. 
Peter. 


## Mark

** 5.65/11.0**

## Miscellaneous marks

| Level | Requirement | Result |
|:-:|---|:-:|
||All files correct                     | .25/.25 |
||Authorship clear for all classes      | .25/.25 |
||Appropriate use of Git                | .5/.5  |
||Program runs from JAR                 | .25/.25 |
|P|Appropriate use of OO features       | .1/.5  |
|P|Presentation PDF complete            | .5/.5  |
|CR|Program well designed               | 0/.5  |
|CR|Comments clear and sufficient       | 0/.5  |
|CR|Coding style good                   | 0/.25 |
|CR|Appropriate use of JUnit tests      | .25/.5  |
|D|Design and code of very high quality | 0/.25 |
|D|Demonstrates interesting extensions  | 0/.25 |
|D|Works well and easy to run           | 0/.25 |
|HD|Game is exceptional                 | 0/.5  |

**Total for miscellaneous marks:**  2.1/5.25

## Game marks (manual)

| Level | Requirement | Result |
|:-:|---|:-:|
|CR|Tiles snap into place            | .15/.25 |
|CR|Tiles can be rotated and flipped | .15/.25 |
|CR|Only valid placements allowed    | .25/.25 |
|CR|Basic score at game end          | .15/.25 |
|D |Basic computer opponent          | 0/.25 |
|HD|Advanced computer opponent       | 0/.5  |

**Total for manual marks:** 0.7/1.75

## Test results

| Task | Test | Result | Marks |
|:-:|---|:-:|:-:|
| |Compiled|.25/.25|.25|
|2|IsTilePlacementWellFormed|3/3|.5|
|3|IsBoardStringWellFormed|6/6|.5|
|5|AreConnectedNeighbours|5/5|.5|
|6|IsValidPlacementSequence|5/5|.5|
|7|GenerateDiceRoll|4/4|.25|
|8|GetBasicScore|2/4|.250|
|10|GenerateMove|1/5|.100|
|12|GetAdvancedScore|0/2|0|

**Total for tests:** 2.85/4.0

## Originality statements

#### Originality statement G
We declare that the work we have submitted for Stage G of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)

* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)

* ....

Signed: Jiamin Dai(u6801714), Jesse Shen (u6718946),

#### Originality statement F
We declare that the work we have submitted for Stage F of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)

* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)

* ....

Signed: Jiamin Dai (u6801714), Jesse Shen (u6718946)

#### Originality statements E
I declare that the work I have submitted for Stage E of this assignment and all stages before it is entirely my own work, with the
following documented exceptions:

* The idea of <...> came from a discussion with <...>

* The code in class <...> uses an idea suggested by <...>

Signed: Jesse Shen (u6718946)
I declare that the work I have submitted for Stage E of this assignment and all stages before it is entirely my own work, with the
following documented exceptions:

* The idea of <...> came from a discussion with <...>

* The code in class <...> uses an idea suggested by <...>

Signed: Jiamin Dai (u6801714)

#### Originality statements D
I declare that the work I have submitted for Stage D of this assignment and all stages before it is entirely my own work, with the following documented exceptions:

* The idea of <...> came from a discussion with <...>

* The code in class <...> uses an idea suggested by <...>

Signed: Jesse Shen (u6718946)
I declare that the work I have submitted for Stage D of this assignment and all stages before it is entirely my own work, with the following documented exceptions:

* The idea of <...> came from a discussion with <...>

* The code in class <...> uses an idea suggested by <...>

Signed: Jiamin Dai (u6801714)

#### Originality statement C
We declare that the work we have submitted for Stage C of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

* Some ideas for javaFX styling came from this website: https://docs.oracle.com/javafx/2/layout/size_align.htm titled: Working With Layouts in JavaFX.


Signed: Jesse (Jiaxi) Shen (u6718946), Jiamin Dai (u6801714), and Brodie Osborne (u5828619)

#### Originality statement B
We declare that the work we have submitted for Stage B of this assignment and all stages before it is entirely our own work, with the following documented exceptions:


Signed: Jesse (Jiaxi) Shen (u6718946), Jiamin Dai (u6801714), and Brodie Osborne (u5828619)

## Git Log
```
commit d1121c7037d47439fc9363091b84b763e8cb302c
Merge: ffdb48a 8356ae9
Author: u6718946 <u6718946@anu,edu.au>
Date:   Fri May 24 11:41:10 2019 +1000

    final version of Ass2

commit ffdb48a80d9423a2ce77e01e40a93fc8548794e7
Merge: 91f3828 8c206c9
Author: u6718946 <u6718946@anu,edu.au>
Date:   Fri May 24 11:10:42 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6718946/comp1110-ass2-tue11g
    
    # Conflicts:
    #       game.jar

commit 8356ae9a2166d6dea3faa6b2f7dc86f36ff76f1f
Author: u6801714 <u6801714@anu.edu.au>
Date:   Fri May 24 11:02:33 2019 +1000

    Updated Viewer

commit 91f382899b4b25276327c54df5d2105911298487
Author: u6718946 <u6718946@anu,edu.au>
Date:   Fri May 24 10:45:57 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6718946/comp1110-ass2-tue11g
    
    # Conflicts:
    #       game.jar

commit 8c206c978f9db602da27b95998b3b4272a63f187
Author: u6801714 <u6801714@anu.edu.au>
Date:   Fri May 24 10:45:17 2019 +1000

    Updated Viewer

commit d5213e30a17360ed8d15cfd583d820666fe951a1
Author: u6718946 <u6718946@anu,edu.au>
Date:   Fri May 24 10:27:54 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6718946/comp1110-ass2-tue11g
    
    # Conflicts:
    #       game.jar

commit 5a71563cc4f1b03e40f708436acb4be5da4ef457
Author: u6718946 <u6718946@anu,edu.au>
Date:   Fri May 24 09:44:17 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6718946/comp1110-ass2-tue11g
    
    # Conflicts:
    #       game.jar

commit cffd6b86544dbbefe3b2143a64852303ee075460
Author: u6718946 <u6718946@anu,edu.au>
Date:   Fri May 24 09:03:33 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6718946/comp1110-ass2-tue11g
    
    # Conflicts:
    #       game.jar

commit 69155efff7283ba7afb089b205528450937d6fae
Merge: 03e6823 7664ea8
Author: u6718946 <u6718946@anu,edu.au>
Date:   Fri May 24 05:18:01 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6718946/comp1110-ass2-tue11g
    
    # Conflicts:
    #       game.jar

commit 03e6823488525a8942259298c0bfe6efd73a76a3
Merge: 08e9e29 d58946e
Author: u6718946 <u6718946@anu,edu.au>
Date:   Fri May 24 05:14:45 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6718946/comp1110-ass2-tue11g
    
    # Conflicts:
    #       game.jar

commit 7664ea897afdc11510746c2be3f9d7703d8d39a3
Author: Jiamin Dai <u6801714@anu.edu.au>
Date:   Fri May 24 05:10:56 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6718946/comp1110-ass2-tue11g
    
    # Conflicts:
    #       game.jar
    #       src/comp1110/ass2/RailroadInk.java

commit 08e9e29185a8a13daac24047376344ae8274db75
Author: u6718946 <u6718946@anu,edu.au>
Date:   Fri May 24 03:58:50 2019 +1000

    Merge remote-tracking branch 'remotes/origin/revert-cfb54faa'
    
    # Conflicts:
    #       src/comp1110/ass2/RailroadInk.java

commit d58946ea69cac4d1f1bbd5ae15a72fd51345bf62
Merge: 998c20a d797760
Author: u6801714 <u6801714@anu.edu.au>
Date:   Fri May 24 03:27:17 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6718946/comp1110-ass2-tue11g
    
    # Conflicts:
    #       game.jar
    #       src/comp1110/ass2/RailroadInk.java

commit 998c20abe6b19b8356196c62f81b731d4c988322
Author: Jiamin Dai <u6801714@anu.edu.au>
Date:   Fri May 24 03:19:49 2019 +1000

    Updated Task 9

commit d797760d2a5a048ce09a968d9ea13398b5fce04c
Author: u6718946 <u6718946@anu,edu.au>
Date:   Fri May 24 00:50:12 2019 +1000

    Merge remote-tracking branch 'remotes/origin/revert-cfb54faa'
    
    # Conflicts:
    #       src/comp1110/ass2/RailroadInk.java

commit db1f667f835e0a7e8f75f5f99376a3eaa31f90ef
Merge: 43c8128 81943df
Author: u6718946 <u6718946@anu,edu.au>
Date:   Thu May 23 23:05:44 2019 +1000

    Merge remote-tracking branch 'remotes/origin/revert-cfb54faa'
    
    # Conflicts:
    #       src/comp1110/ass2/RailroadInk.java

commit 43c8128f17887597c02e6ff3b8e8041c54001fc4
Merge: 38cbe52 c25f4f1
Author: u6718946 <u6718946@anu,edu.au>
Date:   Thu May 23 22:31:04 2019 +1000

    Merge remote-tracking branch 'remotes/origin/revert-cfb54faa'
    
    # Conflicts:
    #       src/comp1110/ass2/RailroadInk.java

commit 38cbe5231b3846e23f3c75fd9167ea5434c45ffe
Author: u6718946 <u6718946@anu,edu.au>
Date:   Thu May 23 22:29:33 2019 +1000

    change Task 8

commit 81943df246a16b3e7de476a340bf4294ee2a8bab
Author: u6801714 <u6801714@anu.edu.au>
Date:   Thu May 23 19:13:07 2019 +1000

    Updated Task 5

commit 1f8407d8dd8e10a978ef17d50a3bf25b550cdc1a
Author: u6801714 <u6801714@anu.edu.au>
Date:   Thu May 23 02:29:40 2019 +0800

    Completed Task6

commit 0054592404cf36e51e18c305374ec55bd18b6ab4
Merge: 743c1c2 7c4363a
Author: u6801714 <u6801714@anu.edu.au>
Date:   Thu May 23 02:28:27 2019 +0800

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       game.jar

commit 743c1c2537ed9a8857c410f1553b3e87203d9781
Author: u6801714 <u6801714@anu.edu.au>
Date:   Thu May 23 02:27:53 2019 +0800

    Completed Task6

commit 7c4363a1ec0ac069ae45f05454a80809141f8a51
Author: u6718946 <u6718946@anu,edu.au>
Date:   Wed May 22 14:43:08 2019 +1000

    updated Viewer

commit 450bc06bd5b298017bbed6ce90dc814e48dc7704
Author: u6801714 <u6801714@anu.edu.au>
Date:   Wed May 22 03:41:43 2019 +0800

    Completed Viewer

commit 49a2bebed76637bdb2a231fa77cda2048ff44542
Author: Jiamin Dai <u6801714@anu.edu.au>
Date:   Wed May 22 03:27:10 2019 +0800

    Completed Viewer

commit 54569dc1e79f53dc54412d13d723bebe5e9a4c8f
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue May 21 01:10:42 2019 +0800

    Updated Viewer

commit e92d2dd2b34812e34e102a1426bb9b3a3f552664
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue May 21 00:31:21 2019 +0800

    Updated Viewer

commit dce69ff664015b443e614228d8a847f15b2a8b27
Author: u6801714 <u6801714@anu.edu.au>
Date:   Mon May 20 23:49:58 2019 +0800

    Updated Viewer

commit 9c44884f59e73054b3c10b8714b7bc21a658ecc8
Author: u6801714 <u6801714@anu.edu.au>
Date:   Wed May 15 00:25:51 2019 +0800

    Updated Viewer

commit fb6a40f1c5ef1a748326b9d6fe714c3fe30f5a64
Author: Jiamin Dai <u6801714@anu.edu.au>
Date:   Tue May 14 23:47:39 2019 +0800

    Updated Viewer

commit 93c5993811bfb10945fe0c9fbc8931476d2408e5
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue May 14 12:54:39 2019 +1000

    Updated Viewer

commit 38045ea63dd8822e1fb3fb7f758e81a1751deecf
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue May 14 12:34:36 2019 +1000

    Updated Viewer

commit a602257df7d7c0f1af866f73ffbc6e7070219f79
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue May 14 12:20:44 2019 +1000

    Updated Viewer(rotate the image)

commit 0b85c27218960af25b1833d637dac35d5fe1bfea
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue May 14 04:24:12 2019 +1000

    Updated viewer

commit 4d1b4174d5c599ca38702c132017addd7a46aa46
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue May 14 03:55:49 2019 +1000

    Updated viewer

commit 0dbe4f49e10f7956a50c39ce3d17d299f57ecbab
Author: Jiamin Dai <u6801714@anu.edu.au>
Date:   Tue May 14 03:15:32 2019 +1000

    Updated review

commit fac75294d0e7c3fb67e5fd6cfdfe577e098f370a
Author: u6718946 <u6718946@anu,edu.au>
Date:   Tue May 14 01:54:14 2019 +1000

    complete D2F, including review!

commit 9adfeaff0ccb36553aa8c6a714e2b22607733714
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue May 14 01:16:50 2019 +1000

    Updated

commit a6a1247a45e42483f94246ff98dac15224fe738b
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue May 14 01:01:49 2019 +1000

    Updated game.jar

commit 0aba3c29cf08136e0d6abd7f6e70f530d6f6eab7
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue May 14 00:46:09 2019 +1000

    Updated game.jar

commit e30d801e7be044237120d5486cb842cbee5d7f52
Author: Jiamin Dai <u6801714@anu.edu.au>
Date:   Tue May 14 00:29:12 2019 +1000

    Updated game.jar

commit 32428f650264d4efe1bff06068f74d9cb3c6a963
Author: u6801714 <u6801714@anu.edu.au>
Date:   Mon May 13 17:57:59 2019 +0800

    Updated F

commit d0e7e61b3c46208bbed4149df298f7a557ab640b
Author: u6801714 <u6801714@anu.edu.au>
Date:   Mon May 13 14:27:49 2019 +1000

    Updated task 7
    
    Signed-off-by: u6801714 <u6801714@anu.edu.au>

commit 4fc2297edd83315831333e07579b78ca6ae393ea
Author: u6801714 <u6801714@anu.edu.au>
Date:   Sun May 12 18:09:17 2019 +1000

    Updated
    
    Signed-off-by: u6801714 <u6801714@anu.edu.au>

commit 6374ab77eed411665760bef377a37264b015baef
Merge: 38b00df 5cc4487
Author: u6801714 <u6801714@anu.edu.au>
Date:   Sun May 12 17:15:51 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit 5cc448733278de86218c9944959e10b73d690ea9
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Thu May 9 00:26:38 2019 +1000

    fix chi-squared test values

commit 38b00df1bfa7987515c206f743d5a5ceea8a494d
Author: Brodie Osborne <brodieosborne12@gmail.com>
Date:   Wed May 8 16:34:54 2019 +1000

    Minor changes to formatting

commit fdc84facdac71c122f014e13a604b637bd8c8590
Author: Brodie Osborne <brodieosborne12@gmail.com>
Date:   Wed May 8 15:29:38 2019 +1000

    Added functionality so that ESC doesn't erase dice. dice button now added to controls

commit 83638167f37ebcc8b4ba7857a67b38c1857f9d47
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Wed May 8 09:51:54 2019 +1000

    improve GenerateDiceRollTest to be statistically more rigorous
    
    added more tests for invalid placements due to duplicates

commit f6998e646dc7b8d48abb21808d8c2acdf7141aae
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Wed May 8 08:19:25 2019 +1000

    isValidPlacementSequenceTest: fix and add test for invalid connection
    
    add test for duplicate placements

commit 84cb2a43ce0605662cf92535678b401f1cebfd98
Author: u6801714 <u6801714@anu.edu.au>
Date:   Wed May 8 00:25:41 2019 +0800

    Updated

commit 03635ba4209c2f9fa2007f97435b4ef17725b96c
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue May 7 13:05:02 2019 +1000

    Updated

commit 6c87b7b8bbab5182285df842d56a83fa61af51b5
Author: Jiamin Dai <u6801714@anu.edu.au>
Date:   Tue May 7 03:36:07 2019 +1000

    Completed personal task
    
    Signed-off-by: u6801714 <u6801714@anu.edu.au>

commit a3af65ea832c9599d4e65bddd3b3b8a116f246c6
Merge: 5ab0589 dd749fd
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue May 7 01:39:35 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6718946/comp1110-ass2-tue11g

commit 5ab0589bfbba5424aece3ed50e390fa9f9653afb
Author: Jiamin Dai <u6801714@anu.edu.au>
Date:   Tue May 7 01:39:04 2019 +1000

    Updated Viewer,Tile
    
    Signed-off-by: u6801714 <u6801714@anu.edu.au>

commit dd749fd1793a1c9006bed35ff8feec012eddf31c
Author: u6718946 <u6718946@anu,edu.au>
Date:   Tue May 7 01:03:13 2019 +1000

    complete personal test and part of task8

commit 20f94fc800715ea7183ddbd6f90ebc0fd31459b0
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Mon May 6 10:50:23 2019 +1000

    remove unused code

commit b953060a4dd8bf37489323395d6cff489c72ced8
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Mon May 6 10:49:17 2019 +1000

    fix GenerateDiceRollTest.testDieFaces to correctly count dice rolls

commit cb6020546dd99bc32c92ef053d41d1b4027bdf9b
Merge: 90e3313 a4c5034
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue Apr 30 02:44:33 2019 +1000

    Merge remote-tracking branch 'origin/master'

commit 90e3313f446c7e11177eb874c5826c0cc12afd70
Author: Jiamin Dai <u6801714@anu.edu.au>
Date:   Tue Apr 30 00:14:42 2019 +1000

    Updated D-originality
    
    Signed-off-by: u6801714 <u6801714@anu.edu.au>

commit a4c503440e696aefcefbfaf1dda641d3ffa5d15f
Author: u6718946 <u6718946@anu,edu.au>
Date:   Tue Apr 30 00:14:42 2019 +1000

    complete a part of task 8!

commit 4bcf3952a8f736b8d03fd6e26c72b797d2885292
Merge: ccf2400 d0e8654
Author: u6801714 <u6801714@anu.edu.au>
Date:   Sun Apr 28 22:39:22 2019 +1000

    Merge remote-tracking branch 'origin/master'

commit ccf2400bcb4d84a3575b239095e6448bc317bace
Author: Jiamin Dai <u6801714@anu.edu.au>
Date:   Tue Apr 23 01:53:14 2019 +0800

    Completed individual task
    
    Signed-off-by: u6801714 <u6801714@anu.edu.au>

commit d0e865468599222d38e5451a74cb332dd713016c
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue Apr 23 01:53:14 2019 +0800

    Completed Task 7

commit 579913c979adf1d3caf959c5fb05b1f9f3f8a1d2
Author: u6718946 <u6718946@anu.edu.au>
Date:   Tue Apr 2 12:33:57 2019 +1100

    update task3

commit c25f4f1185e0e9a730dc7d01625853b5f34accf7
Author: Brodie John Osborne <u5828619@anu.edu.au>
Date:   Tue Apr 2 12:31:38 2019 +1100

    Revert "Completed task5"
    
    This reverts commit cfb54faae03604d88122c8413e84ea2b8a742ab4

commit 14eaceb8b46dadeec5b564010ca2772a0d23b3c5
Merge: cfb54fa 70ff3a6
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue Apr 2 12:30:42 2019 +1100

    Merge remote-tracking branch 'origin/master'

commit cfb54faae03604d88122c8413e84ea2b8a742ab4
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue Apr 2 12:30:25 2019 +1100

    Completed task5

commit 70ff3a6d05a7a73d076b438fb7f51ba1da3c4a08
Merge: 52e2977 b652421
Author: u6718946 <u6718946@anu.edu.au>
Date:   Tue Apr 2 12:26:28 2019 +1100

    update task3

commit 70177abb93a96e2921838d0cb5cbb928f842ac06
Merge: c298faf b652421
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue Apr 2 11:57:11 2019 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6718946/comp1110-ass2-tue11g

commit c298faf419508f243e22b1d8b4fbd4ff606438bc
Merge: 9f5e93f da5575a
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue Apr 2 11:56:00 2019 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6718946/comp1110-ass2-tue11g

commit da5575a62d3460c74753eb72a65101eeb3c356fc
Author: Brodie <u5828619@anu.edu.au>
Date:   Tue Apr 2 10:38:15 2019 +1100

    Cleaned up Tile.java and completed javadocs, took fix me out of Task 5.

commit 9f5e93ff55f4675a7d3831e9beea885c1cc193e3
Merge: 80c145f 96d64a8
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue Apr 2 10:36:27 2019 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6718946/comp1110-ass2-tue11g

commit 96d64a8374e096060563bb3d9b0b59b6eec06750
Merge: e89808a 260f582
Author: Brodie <u5828619@anu.edu.au>
Date:   Tue Apr 2 10:31:23 2019 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6718946/comp1110-ass2-tue11g

commit 9cee2b5b00726f2f206ecd616012ddcc36018c90
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Tue Apr 2 09:12:01 2019 +1100

    AreConnectedNeighboursTest: more tests for mirror-asymmetric tiles

commit 260f582bc61112d9c92275c762f2e2267f34bd3e
Author: u6718946 <u6718946@anu,edu.au>
Date:   Tue Apr 2 07:09:52 2019 +1100

    update task6

commit 80c145fa4d3013ab9d20813bd8bc85d714d4ae93
Merge: cc0643a 5da9998
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue Apr 2 02:53:37 2019 +1100

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       admin/C-contribution.md

commit cc0643a6308da661052e3d956513a38ba68ddc15
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue Apr 2 02:49:52 2019 +1100

    Completed task5

commit 5da9998cbb2d1385ac4283f5f87f50c4d518518c
Author: u6718946 <u6718946@anu,edu.au>
Date:   Tue Apr 2 02:14:48 2019 +1100

    update task6

commit ec003fbf68e1b7461ce1dfd24f47d2ed84cf7a39
Author: u6718946 <u6718946@anu,edu.au>
Date:   Tue Apr 2 02:04:24 2019 +1100

    update task6&C-contribution.md & C-originality

commit b65242172d899913133fc405aeaa8abf7a21a05f
Merge: da5575a 9cee2b5
Author: Brodie Osborne <brodieosborne12@gmail.com>
Date:   Tue Apr 2 00:36:15 2019 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit ad3f158e878c2a9c068a9371f3136e17752ed0a2
Author: u6718946 <u6718946@anu,edu.au>
Date:   Tue Apr 2 00:21:32 2019 +1100

    update task6

commit e89808a6bf920d1f1fcc04413ecc52bb7e9e7478
Author: Brodie <u5828619@anu.edu.au>
Date:   Mon Apr 1 23:21:24 2019 +1100

    Reformatted getTile to getConnection and cleaned up code into a switch

commit 3589a09d3d8a48292f3249b971e1852d99860dc7
Merge: 94e783b b90d865
Author: u6801714 <u6801714@anu.edu.au>
Date:   Mon Apr 1 23:12:54 2019 +1100

    Merge remote-tracking branch 'origin/master'

commit 94e783b15e3b4bd66ffdc8c13468db4659418094
Author: u6801714 <u6801714@anu.edu.au>
Date:   Mon Apr 1 23:12:35 2019 +1100

    Completed task5

commit b90d865754239d75a137a0f0934ce3828f64534f
Author: Brodie Osborne <brodieosborne12@gmail.com>
Date:   Mon Apr 1 11:37:14 2019 +1100

    Added neighbourGrid to Tile. This tells us the grid positions that this tiles neighbours have.

commit 4bec2d09021f90fe155f66756cac3f47ac5aa807
Author: Brodie Osborne <brodieosborne12@gmail.com>
Date:   Mon Apr 1 09:09:06 2019 +1100

    Changed breakPlacementStringToPieces from private to public and made it static

commit 475a822314851ac3d909a7ae89fe5caa91d1a9df
Author: Brodie Osborne <brodieosborne12@gmail.com>
Date:   Mon Apr 1 08:55:02 2019 +1100

    Added javadoc for newest method (makeTileFromString)
    Removed unnneeded variable

commit 7b52afdb67e310da9e2f6142d672c941bcdb2c03
Author: Brodie Osborne <brodieosborne12@gmail.com>
Date:   Mon Apr 1 08:51:44 2019 +1100

    Added ListArray to keep track of Tile objects on the board,
    Added Dai's connections method to Tile.Java,
    Added connections property to Tile

commit 44684c0da896e779bbcf5f33e5a7b7935a4b4f0a
Author: u6801714 <u6801714@anu.edu.au>
Date:   Mon Apr 1 19:36:59 2019 +1100

    Updated

commit 5da2ff0acc79f71e34886913ce9eadf0f884573e
Author: Brodie <u5828619@anu.edu.au>
Date:   Mon Apr 1 02:47:09 2019 +1100

    Updated originality with source for formatting, signed

commit 0bb2060f82d4986596d13ded710fa0aac7bf879d
Author: Brodie <u5828619@anu.edu.au>
Date:   Mon Apr 1 02:46:45 2019 +1100

    Finished task 4, make makePlacement functional and work correctly

commit 58dd99c06851d49423188ef37f106b10e53c1792
Author: Brodie <u5828619@anu.edu.au>
Date:   Mon Apr 1 02:45:53 2019 +1100

    Updated board to reflect replanned grid layout

commit 6aa8a1d51981daab4762a541801dedda42255c48
Author: Brodie <u5828619@anu.edu.au>
Date:   Mon Apr 1 02:45:00 2019 +1100

    Added functionality to apply a xy numerical value to each tile, allowing for placement in a specific grid. Also added rotation and flipping functionality

commit c60e9ac48387e818447b9e4f690f982bb82f9766
Author: Brodie Osborne <brodieosborne12@gmail.com>
Date:   Sun Mar 31 13:49:37 2019 +1100

    Edited run configuration to allow Viewer.java to run as the main class. It was originally located outside of gui folder

commit f63246aae3d8e4ad5c709f006006d380951493e5
Author: Brodie <u5828619@anu.edu.au>
Date:   Mon Apr 1 00:34:09 2019 +1100

    Updated code for getting image from file in Tile.Java, Added offset method to Board.Java

commit c31ba1ef10ecf073353dddfbfd2bb72343c6c495
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Sun Mar 31 08:54:35 2019 +1100

    T10 GenerateMoveTest

commit 5a0302f1af1a21b7302a7be2b7061203f7531b48
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Sat Mar 30 22:39:34 2019 +1100

    T8 GetBasicScoreTest, T12 GetAdvancedScoreTest

commit d61559a8eace9eb0de8948899ccf1a333a7a43eb
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Sat Mar 30 14:39:59 2019 +1100

    test more types of invalid piece placements

commit a3339c1d1ee02b0476d750b0d7f415bb47881597
Author: Jiamin Dai <u6801714@anu.edu.au>
Date:   Fri Mar 29 13:03:16 2019 +1100

    Completed Task2&3

commit 7bdd42688677b4e9dd46e0ecd9fa4ef950c1792c
Author: u6718946 <u6718946@anu.edu.au>
Date:   Tue Mar 26 12:22:50 2019 +1100

    Jesse changes Main.class

commit 513a570aa5baebcae768e37abbbd6ec20ebcd38c
Author: Jesse Shen <u6718946@anu.edu.au>
Date:   Tue Mar 26 12:14:25 2019 +1100

    Jesse changes Main.class

commit 3d35c7adc31d24e2e44f446fa30bd76da12595ad
Merge: 23aead7 23d8916
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue Mar 26 12:12:51 2019 +1100

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/gittest/Main.java

commit 23d8916c6c13689a8f7ef11cbaee4af2361b4edd
Author: Jesse Shen <u6718946@anu.edu.au>
Date:   Tue Mar 26 12:10:03 2019 +1100

    Jesse changes Main.class

commit 23aead7ec48b96c47d94bb204c027a33f7caea7c
Author: Jiamin Dai <u6801714@anu.edu.au>
Date:   Tue Mar 26 12:10:00 2019 +1100

    Updated

commit 52e29777f954130ba3b25077a69457be7563d9ab
Author: Jiamin Dai <u6801714@anu.edu.au>
Date:   Tue Mar 26 12:03:31 2019 +1100

    Updated

commit 24de29c38b24775856017f0a67464a627cdb9652
Author: Jiamin Dai <u6801714@anu.edu.au>
Date:   Tue Mar 26 12:02:55 2019 +1100

    Updated

commit c68482c6221ec6f06538140789ef74355b7130f0
Merge: 9a36374 cb099a3
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue Mar 26 12:00:11 2019 +1100

    Merge remote-tracking branch 'origin/master'

commit cb099a39d2cc37368322ab990d2ecc46c3d77a16
Author: Jesse Shen <u6718946@anu.edu.au>
Date:   Tue Mar 26 11:59:36 2019 +1100

    Create C.class

commit 9a36374e7fff253399f95de6663d30e32ceda4ce
Author: Jiamin Dai <u6801714@anu.edu.au>
Date:   Tue Mar 26 11:58:48 2019 +1100

    Updated

commit 3f956cb767003fc8d716c5a33c52958535696751
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue Mar 26 11:57:12 2019 +1100

    Updated

commit ef80bd3a3671f9ca2dabaa10366a6486071321d7
Author: Jesse Shen <u6718946@anu.edu.au>
Date:   Tue Mar 26 11:54:53 2019 +1100

    a littl change of Board.class

commit 1c416d3956ef5ac8c831126d84ff886e90df1b54
Author: u6718946 <u6718946@anu.edu.au>
Date:   Tue Mar 26 11:47:19 2019 +1100

    a littl change of Board.class

commit 534fd8aa3d6af0543bb4bfc5049026abc6c01747
Merge: 21ae981 87f0a67
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue Mar 26 11:36:14 2019 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit 21ae981eaf158bdb1c174254012af22083a13ae1
Author: u6801714 <u6801714@anu.edu.au>
Date:   Tue Mar 26 11:20:39 2019 +1100

    Updated Game

commit c1290e0fd5d306b62fe924f94fd628362f60e0b7
Author: Brodie <u5828619@anu.edu.au>
Date:   Mon Mar 25 16:15:18 2019 +1100

    Updated contribution and originality,
    Added methods and some small bits of code to Tile class.

commit 1fb7b6b566833cab61658572335066390e817048
Author: u6801714 <u6801714@anu.edu.au>
Date:   Mon Mar 25 16:04:16 2019 +1100

     Updated B-contribution and B-originality

commit 3984651171d0e0e0b80b638e889f5e4741f1e913
Author: u6718946 <u6718946@anu,edu.au>
Date:   Mon Mar 25 15:37:41 2019 +1100

    change B-contribution, B-originality and board.class

commit 4e5c74f3a2ed70c95043a47181ca61208a7e8c0a
Author: u6801714 <u6801714@anu.edu.au>
Date:   Mon Mar 25 13:39:55 2019 +1100

    Updated

commit 87f0a67a1ea2b01ea570f9cbe66f23eacfe13a1c
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Fri Mar 22 16:57:27 2019 +1100

    fix off-by-one errors in Javadoc spec

commit 6899cf1bfb33883edba7d29b261aa2e63950d6be
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Thu Mar 21 21:40:31 2019 +1100

    fix specification for dice roll - B can only roll 0-2
    
    fix IsTilePlacementWellFormedTest and GenerateDiceRollTest accordingly

commit 984e9fef1b9f26e2d4f38cf136ad5e85b4a9a6cd
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Tue Mar 19 02:08:41 2019 +1100

    assignment published
```
## Changes
``` diff
diff -ru -x .git ../master/comp1110-ass2/admin/B-contribution.md comp1110-ass2/admin/B-contribution.md
--- ../master/comp1110-ass2/admin/B-contribution.md	2019-05-24 13:59:03.704392235 +1000
+++ comp1110-ass2/admin/B-contribution.md	2019-05-24 14:57:56.486113862 +1000
@@ -1,7 +1,7 @@
 We declare that the work toward our submission of Stage B was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0234567 30
+* u6718946 33.33
+* u6801714 33.33
+* u5828619 33.33
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0234567)
+Signed: Jesse (Jiaxi) Shen (u6718946), Jiamin Dai (u6801714), and Brodie Osborne (u5828619)
diff -ru -x .git ../master/comp1110-ass2/admin/B-originality.md comp1110-ass2/admin/B-originality.md
--- ../master/comp1110-ass2/admin/B-originality.md	2019-05-24 13:59:03.724392356 +1000
+++ comp1110-ass2/admin/B-originality.md	2019-05-24 14:57:56.542114297 +1000
@@ -1,9 +1,4 @@
 We declare that the work we have submitted for Stage B of this assignment and all stages before it is entirely our own work, with the following documented exceptions:
 
-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
 
-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
-
-*  ....
-
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Jesse (Jiaxi) Shen (u6718946), Jiamin Dai (u6801714), and Brodie Osborne (u5828619)
diff -ru -x .git ../master/comp1110-ass2/admin/C-contribution.md comp1110-ass2/admin/C-contribution.md
--- ../master/comp1110-ass2/admin/C-contribution.md	2019-05-24 13:59:03.740392452 +1000
+++ comp1110-ass2/admin/C-contribution.md	2019-05-24 14:57:56.606114796 +1000
@@ -1,7 +1,7 @@
 We declare that the work toward our submission of Stage C was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0234567 30
+* u6718946 33.33
+* u6801714 33.33
+* u5828619 33.33
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0234567)
+Signed: Jesse (Jiaxi) Shen (u6718946), Jiamin Dai (u6801714), and Brodie Osborne (u5828619)
diff -ru -x .git ../master/comp1110-ass2/admin/C-originality.md comp1110-ass2/admin/C-originality.md
--- ../master/comp1110-ass2/admin/C-originality.md	2019-05-24 13:59:03.768392620 +1000
+++ comp1110-ass2/admin/C-originality.md	2019-05-24 14:57:56.674115326 +1000
@@ -1,9 +1,6 @@
 We declare that the work we have submitted for Stage C of this assignment and all stages before it is entirely our own work, with the following documented exceptions:
 
-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
+* Some ideas for javaFX styling came from this website: https://docs.oracle.com/javafx/2/layout/size_align.htm titled: Working With Layouts in JavaFX.
 
-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
 
-*  ....
-
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Jesse (Jiaxi) Shen (u6718946), Jiamin Dai (u6801714), and Brodie Osborne (u5828619)
diff -ru -x .git ../master/comp1110-ass2/admin/D-originality-u1234567.md comp1110-ass2/admin/D-originality-u1234567.md
--- ../master/comp1110-ass2/admin/D-originality-u1234567.md	2019-05-24 13:59:03.796392788 +1000
+++ comp1110-ass2/admin/D-originality-u1234567.md	2019-05-24 14:57:56.710115606 +1000
@@ -4,4 +4,4 @@
 
 * The code in class <...> uses an idea suggested by <...>
 
-Signed: Mary Jones (u23445678)
+Signed: Jesse Shen (u6718946)
Only in comp1110-ass2/admin: D-originality-u6801714.md
Only in ../master/comp1110-ass2/admin: E-originality-u1234567.md
Only in comp1110-ass2/admin: E-originality-u6718946.md
Only in comp1110-ass2/admin: E-originality-u6801714.md
diff -ru -x .git ../master/comp1110-ass2/admin/F-contribution.md comp1110-ass2/admin/F-contribution.md
--- ../master/comp1110-ass2/admin/F-contribution.md	2019-05-24 13:59:03.852393125 +1000
+++ comp1110-ass2/admin/F-contribution.md	2019-05-24 14:57:56.834116573 +1000
@@ -1,8 +1,8 @@
 We declare that the work toward our submission of Stage F was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0123456 30
+* u6801714 50
+* u6718946 50
+* u0123456 0
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Jiamin Dai (u6801714), Jesse Shen (u6718946)
 
diff -ru -x .git ../master/comp1110-ass2/admin/F-originality.md comp1110-ass2/admin/F-originality.md
--- ../master/comp1110-ass2/admin/F-originality.md	2019-05-24 13:59:03.884393317 +1000
+++ comp1110-ass2/admin/F-originality.md	2019-05-24 14:57:56.854116728 +1000
@@ -6,4 +6,4 @@
 
 * ....
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Jiamin Dai (u6801714), Jesse Shen (u6718946)
Only in ../master/comp1110-ass2/admin: F-review-u1234567.md
Only in comp1110-ass2/admin: F-review-u6718946.md
Only in comp1110-ass2/admin: F-review-u6801714.md
Only in ../master/comp1110-ass2/admin: G-best-u1234567.md
Only in comp1110-ass2/admin: G-best-u6718946.md
Only in comp1110-ass2/admin: G-best-u6801714.md
diff -ru -x .git ../master/comp1110-ass2/admin/G-contribution.md comp1110-ass2/admin/G-contribution.md
--- ../master/comp1110-ass2/admin/G-contribution.md	2019-05-24 13:59:04.000394015 +1000
+++ comp1110-ass2/admin/G-contribution.md	2019-05-24 14:57:57.218119563 +1000
@@ -1,8 +1,8 @@
 We declare that the work toward our submission of Stage G was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0123456 30
+* u6801714 50
+* u6718946 50
+* 
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Jiamin Dai (u6801714), Jesse Shen (u6718946),
 
diff -ru -x .git ../master/comp1110-ass2/admin/G-features.md comp1110-ass2/admin/G-features.md
--- ../master/comp1110-ass2/admin/G-features.md	2019-05-24 13:59:04.028394183 +1000
+++ comp1110-ass2/admin/G-features.md	2019-05-24 14:57:57.262119906 +1000
@@ -3,11 +3,10 @@
 
 *(Remove those that are unimplemented)*
 
- - A simple placement viewer (Task 4)
- - A basic playable game
- - A basic playable game that snaps pieces to the board and checks for validity (Task 7)
- - Generates basic starting piece placements (Task 8)
- - Implements hints (Task 10)
- - Implements interesting starting placements (Task 11)
+ X A simple placement viewer (Task 4)
+ X A basic playable game
+ X A basic playable game that snaps pieces to the board and checks for validity (Task 7)
+ X Generates basic starting piece placements (Task 8)
 
 additional features...
+The game is basically palyable and can get part of basic score, but failed to get the correct part of basic score that means number of exits connected.
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/admin/G-originality.md comp1110-ass2/admin/G-originality.md
--- ../master/comp1110-ass2/admin/G-originality.md	2019-05-24 13:59:04.048394304 +1000
+++ comp1110-ass2/admin/G-originality.md	2019-05-24 14:57:57.314120311 +1000
@@ -6,4 +6,4 @@
 
 * ....
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Jiamin Dai(u6801714), Jesse Shen (u6718946),
Only in comp1110-ass2: feedback.md
Only in comp1110-ass2: game.jar
Only in comp1110-ass2/.idea: artifacts
diff -ru -x .git ../master/comp1110-ass2/.idea/runConfigurations/T2_IsTilePlacementWellFormedTest.xml comp1110-ass2/.idea/runConfigurations/T2_IsTilePlacementWellFormedTest.xml
--- ../master/comp1110-ass2/.idea/runConfigurations/T2_IsTilePlacementWellFormedTest.xml	2019-05-24 13:59:03.500391008 +1000
+++ comp1110-ass2/.idea/runConfigurations/T2_IsTilePlacementWellFormedTest.xml	2019-05-24 14:57:56.194111586 +1000
@@ -3,7 +3,7 @@
     <module name="comp1110-ass2" />
     <extension name="coverage">
       <pattern>
-        <option name="PATTERN" value="comp1110.ass2.gui.*" />
+        <option name="PATTERN" value="comp1110.ass2.*" />
         <option name="ENABLED" value="true" />
       </pattern>
     </extension>
@@ -16,4 +16,4 @@
       <option name="Make" enabled="true" />
     </method>
   </configuration>
-</component>
+</component>
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/.idea/runConfigurations/Viewer.xml comp1110-ass2/.idea/runConfigurations/Viewer.xml
--- ../master/comp1110-ass2/.idea/runConfigurations/Viewer.xml	2019-05-24 13:59:03.664391995 +1000
+++ comp1110-ass2/.idea/runConfigurations/Viewer.xml	2019-05-24 14:57:56.378113019 +1000
@@ -5,7 +5,7 @@
     <option name="VM_PARAMETERS" value="-ea --module-path ${PATH_TO_FX} --add-modules=javafx.controls,javafx.fxml,javafx.media" />
     <extension name="coverage">
       <pattern>
-        <option name="PATTERN" value="comp1110.ass2.gui.*" />
+        <option name="PATTERN" value="comp1110.ass2.*" />
         <option name="ENABLED" value="true" />
       </pattern>
     </extension>
@@ -13,4 +13,4 @@
       <option name="Make" enabled="true" />
     </method>
   </configuration>
-</component>
+</component>
\ No newline at end of file
Only in comp1110-ass2: presentation.pdf
Only in comp1110-ass2/src/comp1110/ass2: Board.class
Only in comp1110-ass2/src/comp1110/ass2: Board.java
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: Blank.png
Only in comp1110-ass2/src/comp1110/ass2/gui: Game.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game.java
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$10$1.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$10.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$1$1.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$11.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$12.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$13.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$14.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$15.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$16.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$17.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$18.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$19.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$1.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$20.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$2$1.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$21.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$2.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$3$1.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$3.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$4$1.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$4.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$5$1.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$5.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$6$1.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$6.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$7$1.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$7.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$8$1.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$8.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$9$1.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$9.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer.class
diff -ru -x .git ../master/comp1110-ass2/src/comp1110/ass2/gui/Viewer.java comp1110-ass2/src/comp1110/ass2/gui/Viewer.java
--- ../master/comp1110-ass2/src/comp1110/ass2/gui/Viewer.java	2019-05-24 13:59:04.616397720 +1000
+++ comp1110-ass2/src/comp1110/ass2/gui/Viewer.java	2019-05-24 14:57:59.186134886 +1000
@@ -1,13 +1,37 @@
 package comp1110.ass2.gui;
 
 import javafx.application.Application;
+import javafx.event.ActionEvent;
+import javafx.event.EventHandler;
+import javafx.geometry.Point2D;
 import javafx.scene.Group;
+import javafx.scene.Node;
 import javafx.scene.Scene;
 import javafx.scene.control.Button;
 import javafx.scene.control.Label;
 import javafx.scene.control.TextField;
+import javafx.scene.image.Image;
+import javafx.scene.image.ImageView;
+import javafx.scene.input.*;
 import javafx.scene.layout.HBox;
+import javafx.scene.layout.StackPane;
+import javafx.scene.paint.Color;
+import javafx.scene.shape.Line;
+import javafx.scene.text.Text;
+import javafx.scene.transform.Rotate;
+import javafx.stage.Screen;
 import javafx.stage.Stage;
+import comp1110.ass2.Tile;
+import comp1110.ass2.Board;
+import comp1110.ass2.RailroadInk;
+import javafx.stage.Window;
+
+import javax.swing.*;
+import java.util.ArrayList;
+import java.util.List;
+
+import static comp1110.ass2.Board.getOffset;
+import static comp1110.ass2.Board.getboardplace;
 
 /**
  * A very simple viewer for tile placements in the Railroad Ink game.
@@ -19,20 +43,113 @@
     /* board layout */
     private static final int VIEWER_WIDTH = 1024;
     private static final int VIEWER_HEIGHT = 768;
+    public static int horizontalOffset = (VIEWER_WIDTH - 700) / 2;
+    public static int verticalOffset = (VIEWER_HEIGHT - 700) / 2;
+    public List<Tile> tileArray = new ArrayList<>();
 
     private static final String URI_BASE = "assets/";
 
     private final Group root = new Group();
     private final Group controls = new Group();
+    private final Group tiles = new Group();
+    private final Group lines = new Group();
+    private static Group tiledice=new Group();
+    private static Group boardtile=new Group();
+    public static Group specialtile=new Group();
+    private static ArrayList<Integer> specialblank=new ArrayList<>();
+    private static ArrayList<String> boardstring=new ArrayList<>();
+    private static ArrayList<String> d=new ArrayList<>();
+    private static int sum=0;
+    private static int sum1=0;
+    private static int sum2=0;
+    private static int sum3=0;
+    private static int sum4=0;
+    private static int sum5=0;
+    private static int sum6=0;
+    private static int sum7=0;
+    private static int sum8=0;
+    private static int round=0;
+    private static int sum9=0;
+    private static int sum10=0;
+    private static int sum11=0;
     TextField textField;
 
+
+    //TODO PLACE THIS METHOD INTO RAILROADINK
+    //	Break placement string into piece strings for use
+    /**
+     * @author Jesse Shen(u6718946)
+    */
+
+    //Turns ABCDEFGHIJ into ['ABCDE','FGHIJ']
+    public static List breakPlacementStringToPieces(String placement) {
+        if (placement!=null) {
+            int count = 0;
+            int index = 0;
+            int len = placement.length();
+            List<String> pieces = new ArrayList<>();
+            while (count <= (len - 1)) {
+                pieces.add(index, ("" + placement.charAt(count) + placement.charAt(count + 1) + placement.charAt(count + 2) + placement.charAt(count + 3) + placement.charAt(count + 4)));
+                count += 5;
+                index += 1;
+            }
+            return pieces;
+        }
+        return null;
+    }
+
+
+    //Draw lines onto stage to create a grid
+    private void drawGrid() {
+        String grid = "12345678";
+
+        for (int count = 0; count <= 7; count++) {
+            char col = grid.charAt(count);
+
+            Line line = new Line();
+            line.setStartX(horizontalOffset + getOffset(col));
+            line.setStartY(verticalOffset);
+            line.setEndX(horizontalOffset + getOffset(col));
+            line.setEndY(700.0f + verticalOffset);
+            line.setFill(Color.PURPLE);
+            lines.getChildren().add(line);
+        }
+
+        for (int count1 = 0; count1 <= 7; count1++) {
+            char row = grid.charAt(count1);
+
+            Line line = new Line();
+            line.setStartX(horizontalOffset);
+            line.setStartY(verticalOffset + getOffset(row));
+            line.setEndX(700.0f + horizontalOffset);
+            line.setEndY(verticalOffset + getOffset(row));
+            line.setFill(Color.BLACK);
+            lines.getChildren().add(line);
+        }
+    }
+
     /**
      * Draw a placement in the window, removing any previously drawn one
      *
      * @param placement A valid placement string
      */
-    void makePlacement(String placement) {
-        // FIXME Task 4: implement the simple placement viewer
+//    the tile placement string: B0A53
+//    tells us that the tile on die B face 0 is placed at grid A5 in orientation 3,
+//    whereas S3G26 tells us Special tile 3 is placed at G2 in orientation 6
+    private void makePlacement(String placement) {
+        for (Object item : breakPlacementStringToPieces(placement)) {
+            String piece = item.toString();
+            Tile tile = Tile.makeTileFromString(piece);
+            ImageView iv = tile.imgview;
+            iv.setPreserveRatio(true);
+            iv.setSmooth(true);
+
+            tileArray.add(tile);
+            tiles.getChildren().add(iv);
+            System.out.println(tile.neighbourGrids);
+        }
+        root.getChildren().add(tiles);
+        System.out.println(tileArray.get(0));
     }
 
     /**
@@ -44,26 +161,490 @@
         textField.setPrefWidth(300);
         Button button = new Button("Refresh");
         button.setOnAction(e -> {
+            tiles.getChildren().clear();
+            root.getChildren().clear();
+            root.getChildren().add(controls);
+            root.getChildren().add(lines);
+            System.out.println(textField.getText());
             makePlacement(textField.getText());
             textField.clear();
         });
         HBox hb = new HBox();
         hb.getChildren().addAll(label1, textField, button);
         hb.setSpacing(10);
-        hb.setLayoutX(130);
-        hb.setLayoutY(VIEWER_HEIGHT - 50);
+        hb.setLayoutX(horizontalOffset);
+        hb.setLayoutY(VIEWER_HEIGHT - 27);
+        hb.setPrefWidth(700);
         controls.getChildren().add(hb);
     }
 
+    private void initilisehandlers(Scene scene) {
+        /* create handlers for key  */
+        scene.setOnKeyPressed(event -> {
+            if (event.getCode() == KeyCode.ESCAPE) {
+                tiles.getChildren().clear();
+                root.getChildren().clear();
+                root.getChildren().add(controls);
+                root.getChildren().add(tiledice);
+                root.getChildren().add(lines);
+
+                event.consume();
+            }
+        });
+    }
+
+    //A4A12B2B16A1B01A1B23S1B32A1A32B1B44B2A44A4C16A3D15A4D01A5D23A4E20B1F24A2F17A1F01B0G16A5C34A4C43A5C53A3D50A4D61S4E50A0F51A1F67S2E46B1E31A1F30A2G36A1G41B1G52
+    //Test data to enter
+    /**
+     * After this,all these methods are done by
+     * @author Jiamin Dai u6801714**/
+    public void exit(){
+        Image image=new Image("comp1110/ass2/gui/assets/HighExit.png");
+        Image image1=new Image("comp1110/ass2/gui/assets/RailExit.png");
+        root.getChildren().add(Board.setexit(image,image1));
+    }
+
+
+    public double setonboardx(double location){
+        int x=(int)((location-horizontalOffset)/100);
+        double setX=horizontalOffset+x*100+50;
+        return setX;
+    }
+
+    public double setonboardy(double location){
+        int y=(int)((location-verticalOffset)/100);
+        double setY=verticalOffset+y*100+50;
+        return setY;
+    }
+
+    public void setBoardtile(String tile,double x,double y,int s){
+        Image originalImage = new Image("comp1110/ass2/gui/assets/" + tile + ".png");
+        ImageView iv=new ImageView();
+        iv.setImage(originalImage);
+        iv.setFitHeight(100);
+        iv.setFitWidth(100);
+        iv.setX(x-50);
+        iv.setY(y-50);
+        iv.setRotate(90*s);
+        boardtile.getChildren().add(iv);
+    }
+    public void specialtileblank1(){
+        Tile.getspecialtileback();
+        if (specialblank.contains(0)){
+            specialtile.getChildren().remove(0);
+            specialtile.getChildren().add(0, Board.coverthetile(890, 10));
+        }
+        if (specialblank.contains(1)){
+            specialtile.getChildren().remove(1);
+            specialtile.getChildren().add(1,Board.coverthetile(890,120));
+        }
+        if (specialblank.contains(2)){
+            specialtile.getChildren().remove(2);
+            specialtile.getChildren().add(2,Board.coverthetile(890,230));
+        }
+        if (specialblank.contains(3)){
+            specialtile.getChildren().remove(3);
+            specialtile.getChildren().add(3,Board.coverthetile(890,340));
+        }
+        if (specialblank.contains(4)){
+            specialtile.getChildren().remove(4);
+            specialtile.getChildren().add(4,Board.coverthetile(890,450));
+        }
+        if (specialblank.contains(5)){
+            specialtile.getChildren().remove(5);
+            specialtile.getChildren().add(5,Board.coverthetile(890,560));
+        }
+    }
+    /**
+     * drop and drag tiledice&specialtile
+     * the String tiles is to get the five character which is tile in the board,and add the tile to the boardstring
+     * if the placement is not valid,the boardstring will remove tiles
+     * @author Jiamin Dai u6801714
+     * **/
+    public void clickdropanddrag(){
+        tiledice.getChildren().get(0).setOnMousePressed(new EventHandler<MouseEvent>() {
+            @Override
+            public void handle(MouseEvent mouseEvent) {
+                tiledice.getChildren().get(0).setOnMouseReleased(new EventHandler<MouseEvent>() {
+                    @Override
+                    public void handle(MouseEvent mouseEvent) {
+                        String tiles=d.get(0)+Board.getboardplace(setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()))+sum%8;
+                        boardstring.add(tiles);
+                        if (RailroadInk.isValidPlacementSequence(savetileandboard())){
+                            setBoardtile(d.get(0),setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()),sum);
+                            tiledice.getChildren().remove(0);
+                            tiledice.getChildren().add(0,Board.coverthetile(20,100));
+                        }
+                        else {boardstring.remove(tiles);
+                            System.out.println("tile");}
+                    }
+                });
+            }
+        });
+
+        tiledice.getChildren().get(1).setOnMousePressed(new EventHandler<MouseEvent>() {
+            @Override
+            public void handle(MouseEvent mouseEvent) {
+                tiledice.getChildren().get(1).setOnMouseReleased(new EventHandler<MouseEvent>() {
+                    @Override
+                    public void handle(MouseEvent mouseEvent) {
+                        String tiles=d.get(1)+Board.getboardplace(setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()))+sum1%8;
+                        boardstring.add(tiles);
+                        if (RailroadInk.isValidPlacementSequence(savetileandboard())){
+                            setBoardtile(d.get(1),setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()),sum1);
+                            tiledice.getChildren().remove(1);
+                            tiledice.getChildren().add(1,Board.coverthetile(20,210));
+                        }
+                        else {boardstring.remove(tiles); }
+                    }
+                });
+            }
+        });
+
+        tiledice.getChildren().get(2).setOnMousePressed(new EventHandler<MouseEvent>() {
+            @Override
+            public void handle(MouseEvent mouseEvent) {
+                tiledice.getChildren().get(2).setOnMouseReleased(new EventHandler<MouseEvent>() {
+                    @Override
+                    public void handle(MouseEvent mouseEvent) {
+                        String tiles=d.get(2)+Board.getboardplace(setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()))+sum2%8;
+                        boardstring.add(tiles);
+                        if (RailroadInk.isValidPlacementSequence(savetileandboard())){
+                            setBoardtile(d.get(2),setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()),sum2);
+                            tiledice.getChildren().remove(2);
+                            tiledice.getChildren().add(2,Board.coverthetile(20,320));
+                        }
+                        else {boardstring.remove(tiles); }
+                    }
+                });
+            }
+        });
+
+        tiledice.getChildren().get(3).setOnMousePressed(new EventHandler<MouseEvent>() {
+            @Override
+            public void handle(MouseEvent mouseEvent) {
+                tiledice.getChildren().get(3).setOnMouseReleased(new EventHandler<MouseEvent>() {
+                    @Override
+                    public void handle(MouseEvent mouseEvent) {
+                        String tiles=d.get(3)+Board.getboardplace(setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()))+sum3%8;
+                        boardstring.add(tiles);
+                        if (RailroadInk.isValidPlacementSequence(savetileandboard())){
+                            setBoardtile(d.get(3),setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()),sum3);
+                            tiledice.getChildren().remove(3);
+                            tiledice.getChildren().add(3,Board.coverthetile(20,430));
+                        }
+                        else {boardstring.remove(tiles); }
+                    }
+                });
+            }
+        });
+
+
+    }
+
+    public void clickanddrop1(){
+        specialtile.getChildren().get(0).setOnMousePressed(new EventHandler<MouseEvent>() {
+            @Override
+            public void handle(MouseEvent mouseEvent) {
+                specialtile.getChildren().get(0).setOnMouseReleased(new EventHandler<MouseEvent>() {
+                    @Override
+                    public void handle(MouseEvent mouseEvent) {
+                        String tiles="S0"+Board.getboardplace(setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()))+sum4%8;
+                        boardstring.add(tiles);
+                        sum11++;
+                            if (RailroadInk.isValidPlacementSequence(savetileandboard())) {
+                                boardtile.getChildren().add(Tile.setspecialtile("S0", setonboardx(mouseEvent.getSceneX()), setonboardy(mouseEvent.getSceneY()), sum4));
+                                specialblank.add(0);
+                                Tile.specialtileblank();
+                            }
+                            else{
+                                boardstring.remove(tiles);
+                                System.out.println("special");
+                                System.out.println(savetileandboard());
+                            }
+                        }
+                });
+            }
+        });
+
+        specialtile.getChildren().get(1).setOnMousePressed(new EventHandler<MouseEvent>() {
+            @Override
+            public void handle(MouseEvent mouseEvent) {
+                specialtile.getChildren().get(1).setOnMouseReleased(new EventHandler<MouseEvent>() {
+                    @Override
+                    public void handle(MouseEvent mouseEvent) {
+                        String tiles="S1"+Board.getboardplace(setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()))+sum5%8;
+                        boardstring.add(tiles);
+                        sum11++;
+                        if (RailroadInk.isValidPlacementSequence(savetileandboard())){
+                            boardtile.getChildren().add(Tile.setspecialtile("S1",setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()),sum5));
+                            specialblank.add(1);
+                            Tile.specialtileblank();
+                        }
+                        else{ boardstring.remove(tiles); }
+                    }
+                });
+            }
+        });
+
+        specialtile.getChildren().get(2).setOnMousePressed(new EventHandler<MouseEvent>() {
+            @Override
+            public void handle(MouseEvent mouseEvent) {
+                specialtile.getChildren().get(2).setOnMouseReleased(new EventHandler<MouseEvent>() {
+                    @Override
+                    public void handle(MouseEvent mouseEvent) {
+                        String tiles="S2"+Board.getboardplace(setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()))+sum6%8;
+                        boardstring.add(tiles);
+                        sum11++;
+                        if (RailroadInk.isValidPlacementSequence(savetileandboard())){
+                        boardtile.getChildren().add(Tile.setspecialtile("S2",setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()),sum6));
+                        specialblank.add(2);
+                        Tile.specialtileblank();}
+                        else{ boardstring.remove(tiles); }
+                    }
+                });
+            }
+        });
+
+        specialtile.getChildren().get(3).setOnMousePressed(new EventHandler<MouseEvent>() {
+            @Override
+            public void handle(MouseEvent mouseEvent) {
+                specialtile.getChildren().get(3).setOnMouseReleased(new EventHandler<MouseEvent>() {
+                    @Override
+                    public void handle(MouseEvent mouseEvent) {
+                        String tiles="S3"+Board.getboardplace(setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()))+sum7%8;
+                        boardstring.add(tiles);
+                        sum11++;
+                        if (RailroadInk.isValidPlacementSequence(savetileandboard())){
+                            boardtile.getChildren().add(Tile.setspecialtile("S3",setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()),sum7));
+                            specialblank.add(3);
+                            Tile.specialtileblank();
+                            }
+                        else{ boardstring.remove(tiles); }
+                    }
+                });
+            }
+        });
+
+        specialtile.getChildren().get(4).setOnMousePressed(new EventHandler<MouseEvent>() {
+            @Override
+            public void handle(MouseEvent mouseEvent) {
+                specialtile.getChildren().get(4).setOnMouseReleased(new EventHandler<MouseEvent>() {
+                    @Override
+                    public void handle(MouseEvent mouseEvent) {
+                        String tiles="S4"+Board.getboardplace(setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()))+sum8%8;
+                        boardstring.add(tiles);
+                        sum11++;
+                        if (RailroadInk.isValidPlacementSequence(savetileandboard())){
+                            boardtile.getChildren().add(Tile.setspecialtile("S4",setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()),sum8));
+                            specialblank.add(4);
+                            Tile.specialtileblank();
+                        }
+                        else{ boardstring.remove(tiles); }
+                    }
+                });
+            }
+        });
+
+        specialtile.getChildren().get(5).setOnMousePressed(new EventHandler<MouseEvent>() {
+            @Override
+            public void handle(MouseEvent mouseEvent) {
+                specialtile.getChildren().get(5).setOnMouseReleased(new EventHandler<MouseEvent>() {
+                    @Override
+                    public void handle(MouseEvent mouseEvent) {
+                        String tiles="S5"+Board.getboardplace(setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()))+sum9%8;
+                        boardstring.add(tiles);
+                        sum11++;
+                        if (RailroadInk.isValidPlacementSequence(savetileandboard())){
+                            boardtile.getChildren().add(Tile.setspecialtile("S5",setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()),sum9));
+                            specialblank.add(5);
+                            Tile.specialtileblank();
+                        }
+                        else{ boardstring.remove(tiles); }
+                    }
+                });
+            }
+        });
+    }
+
+    public String savetileandboard(){
+        String ListString="";
+        for (String s:boardstring){
+            ListString+=s;
+        }
+        return ListString;
+    }
+    /**rotate image,use scroll
+     * @author Jiamin Dai u6801714
+     * **/
+    public void rotateimage(){
+        /**@author Jiamin Dai u6801714
+         * rotate image under dice**/
+        tiledice.getChildren().get(0).setOnScroll(new EventHandler<ScrollEvent>() {
+            @Override
+            public void handle(ScrollEvent scrollEvent) {
+                tiledice.getChildren().get(0).setRotate(90+90*sum);
+                sum++;
+                clickdropanddrag();
+            }
+        });
+
+        tiledice.getChildren().get(1).setOnScroll(new EventHandler<ScrollEvent>() {
+            @Override
+            public void handle(ScrollEvent scrollEvent) {
+                tiledice.getChildren().get(1).setRotate(90+90*sum1);
+                sum1++;
+            }
+        });
+
+        tiledice.getChildren().get(2).setOnScroll(new EventHandler<ScrollEvent>() {
+            @Override
+            public void handle(ScrollEvent scrollEvent) {
+                tiledice.getChildren().get(2).setRotate(90+90*sum2);
+                sum2++;
+            }
+        });
+
+        tiledice.getChildren().get(3).setOnScroll(new EventHandler<ScrollEvent>() {
+            @Override
+            public void handle(ScrollEvent scrollEvent) {
+                tiledice.getChildren().get(3).setRotate(90+90*sum3);
+                sum3++;
+            }
+        });
+
+
+
+    }
+    public void rotateimage1(){
+        specialtile.getChildren().get(0).setOnScroll(new EventHandler<ScrollEvent>() {
+            @Override
+            public void handle(ScrollEvent scrollEvent) {
+                specialtile.getChildren().get(0).setRotate(90+90*sum4);
+                sum4++;
+            }
+        });
+
+        specialtile.getChildren().get(1).setOnScroll(new EventHandler<ScrollEvent>() {
+            @Override
+            public void handle(ScrollEvent scrollEvent) {
+                specialtile.getChildren().get(1).setRotate(90+90*sum5);
+                sum5++;
+            }
+        });
+
+        specialtile.getChildren().get(2).setOnScroll(new EventHandler<ScrollEvent>() {
+            @Override
+            public void handle(ScrollEvent scrollEvent) {
+                specialtile.getChildren().get(2).setRotate(90+90*sum6);
+                sum6++;
+            }
+        });
+
+        specialtile.getChildren().get(3).setOnScroll(new EventHandler<ScrollEvent>() {
+            @Override
+            public void handle(ScrollEvent scrollEvent) {
+                specialtile.getChildren().get(3).setRotate(90+90*sum7);
+                sum7++;
+            }
+        });
+
+        specialtile.getChildren().get(4).setOnScroll(new EventHandler<ScrollEvent>() {
+            @Override
+            public void handle(ScrollEvent scrollEvent) {
+                specialtile.getChildren().get(4).setRotate(90+90*sum8);
+                sum8++;
+            }
+        });
+
+        specialtile.getChildren().get(5).setOnScroll(new EventHandler<ScrollEvent>() {
+            @Override
+            public void handle(ScrollEvent scrollEvent) {
+                specialtile.getChildren().get(5).setRotate(90+90*sum9);
+                sum9++;
+            }
+        });
+    }
+
+
+    private void ClickDice(){
+        /**@author u6801714 Jiamin Dai
+        //         * add button
+        //         * click dice button and there will be get generatedice method and have four image
+         **/
+        Button btn = new Button("Dice");
+        btn.setLayoutX(50);
+        btn.setLayoutY(50);
+        specialtile=Tile.specialtile();
+        root.getChildren().add(specialtile);
+        root.getChildren().add(tiledice);
+        Group text=new Group();
+        Text r=new Text();
+        Text score=new Text();
+        btn.setOnAction(new EventHandler<ActionEvent>() {
+            @Override
+            public void handle(ActionEvent actionEvent) {
+                specialtileblank1();
+                if (sum11>=3)
+                    Tile.specialtileblank();
+                else{
+                    rotateimage1();
+                    clickanddrop1();
+                }
+                text.getChildren().clear();
+                sum=0;
+                sum1=0;
+                sum2=0;
+                sum3=0;
+                tiledice.getChildren().clear();
+                ArrayList<String> dice=new ArrayList<>();
+                dice=Tile.generateTile(RailroadInk.generateDiceRoll());
+                d=dice;
+                for (int i=0;i<4;i++){
+                    tiledice.getChildren().add(Tile.rotateImageinDice(dice.get(i),100+110*i));
+                }
+                rotateimage();
+                clickdropanddrag();
+                round++;
+                if (round<=7){
+                    r.setText("Round:"+round);
+                    r.setX(50);
+                    r.setY(700);
+                    text.getChildren().add(r);
+                } else{
+                    score.setText("Score:"+RailroadInk.getBasicScore(savetileandboard()));
+                    score.setX(50);
+                    score.setY(720);
+                    tiledice.getChildren().clear();
+                    Tile.specialtileblank();
+                }
+            }
+        });
+        root.getChildren().add(score);
+        root.getChildren().add(text);
+        controls.getChildren().add(btn);
+        root.getChildren().add(boardtile);
+    }
+
+
+
     @Override
     public void start(Stage primaryStage) throws Exception {
         primaryStage.setTitle("StepsGame Viewer");
         Scene scene = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);
+        ClickDice();
 
         root.getChildren().add(controls);
 
         makeControls();
 
+        //Draw board grid
+        drawGrid();
+        root.getChildren().add(lines);
+        exit();
+        //Initialise handlers
+        initilisehandlers(scene);
+
         primaryStage.setScene(scene);
         primaryStage.show();
     }
Only in comp1110-ass2/src/comp1110/ass2: RailroadInk.class
diff -ru -x .git ../master/comp1110-ass2/src/comp1110/ass2/RailroadInk.java comp1110-ass2/src/comp1110/ass2/RailroadInk.java
--- ../master/comp1110-ass2/src/comp1110/ass2/RailroadInk.java	2019-05-24 13:59:04.556397359 +1000
+++ comp1110-ass2/src/comp1110/ass2/RailroadInk.java	2019-05-24 14:57:59.142134543 +1000
@@ -1,5 +1,14 @@
 package comp1110.ass2;
 
+import com.sun.glass.ui.View;
+import comp1110.ass2.gui.Viewer;
+
+import java.awt.*;
+import java.util.ArrayList;
+import java.util.Arrays;
+import java.util.List;
+import java.util.Random;
+
 public class RailroadInk {
     /**
      * Determine whether a tile placement string is well-formed:
@@ -12,10 +21,29 @@
      *
      * @param tilePlacementString a candidate tile placement string
      * @return true if the tile placement is well formed
+     * @author Jiamin Dai(u6801714)
      */
     public static boolean isTilePlacementWellFormed(String tilePlacementString) {
         // FIXME Task 2: determine whether a tile placement is well-formed
-        return false;
+        char []t=tilePlacementString.toCharArray();
+        if(tilePlacementString.length()==5){
+            if(t[0]=='A'||t[0]=='S'){
+                if(t[1]>='0'&&t[1]<='5'&&t[2]>='A'&&t[2]<='G'&&t[3]>='0'&&t[3]<='6'&&t[4]>='0'&&t[4]<='7')
+                    return true;
+                else
+                   return false;
+            }
+            else if(t[0]=='B'){
+                if(t[1]>='0'&&t[1]<='2'&&t[2]>='A'&&t[2]<='G'&&t[3]>='0'&&t[3]<='6'&&t[4]>='0'&&t[4]<='7')
+                   return true;
+                else
+                   return false;
+            }
+            else
+               return false;
+        }
+        else
+            return false;
     }
 
     /**
@@ -26,10 +54,36 @@
      *
      * @param boardString a board string describing the placement of one or more pieces
      * @return true if the board string is well-formed
+     * @author Jiamin Dai(u6801714)
      */
     public static boolean isBoardStringWellFormed(String boardString) {
         // FIXME Task 3: determine whether a board string is well-formed
-        return false;
+
+        if(boardString==null)
+            return false;
+
+        int amount1 = (boardString.length()/5);
+
+        for (int i = 0;i<(amount1);i++) {
+            String thistile = boardString.substring((0 + i * 5), (5 + i * 5));
+            if (!isTilePlacementWellFormed(thistile)) {
+                return false;
+            }
+        }
+        char []t=boardString.toCharArray();
+        int sum=0;
+        if(boardString.length()%5==0&&boardString.length()<=155&&boardString.length()>=5){
+        for(int i=0;i<boardString.length();i+=5){
+            if(t[i]=='S')
+                sum++;
+        }
+        if(sum>3)
+                return false;
+        else
+        return true;
+        }
+        else
+                return false;
     }
 
 
@@ -43,10 +97,59 @@
      * areConnectedNeighbours("A0B30", "A3C23") would return false as these tiles are not neighbours.
      *
      * @return true if the placements are connected neighbours
+     * @author Jiamin Dai(u6801714)
      */
+
+    /**
+     *     0
+     *   1  3
+     *    2
+     * **/
     public static boolean areConnectedNeighbours(String tilePlacementStringA, String tilePlacementStringB) {
-        // FIXME Task 5: determine whether neighbouring placements are connected
-        return false;
+        if (tilePlacementStringA==""||tilePlacementStringB==""){
+            return false;
+        }
+        else {
+            String strA=Tile.tileReset(tilePlacementStringA);
+            String strB=Tile.tileReset(tilePlacementStringB);
+            char rowA=tilePlacementStringA.charAt(2);
+            char rowB=tilePlacementStringB.charAt(2);
+            char colA=tilePlacementStringA.charAt(3);
+            char colB=tilePlacementStringB.charAt(3);
+            if (rowA==rowB){
+                if (colA==colB-1&&strA.charAt(3)==strB.charAt(1)&&strA.charAt(3)!='N')
+                    return true;
+                else if (colA==colB+1&&strA.charAt(1)==strB.charAt(3)&&strA.charAt(1)!='N')
+                    return true;
+                else
+                    return false;
+            }
+            else if (colA==colB){
+                if (rowA==rowB+1&&strA.charAt(0)==strB.charAt(2)&&strB.charAt(2)!='N')
+                    return true;
+                else if (rowA==rowB-1&&strA.charAt(2)==strB.charAt(0)&&strB.charAt(0)!='N')
+                    return true;
+                else
+                    return false;
+            }
+            else
+                return false;
+        }
+
+//        if(tilePlacementStringA.charAt(2)==tilePlacementStringB.charAt(2)&&tilePlacementStringA.charAt(3)==tilePlacementStringB.charAt(3)+1&&str3.charAt(1)==str4.charAt(3)&&str3.charAt(1)!='N')
+//                return true;
+//        else if (tilePlacementStringA.charAt(3)==tilePlacementStringB.charAt(3)&&tilePlacementStringA.charAt(2)==tilePlacementStringB.charAt(2)+1&&str3.charAt(0)==str4.charAt(2)&&str3.charAt(0)!='N')
+//                return true;
+//        else if (tilePlacementStringA.charAt(2)==tilePlacementStringB.charAt(2)&&tilePlacementStringA.charAt(3)==tilePlacementStringB.charAt(3)-1&&str3.charAt(3)==str4.charAt(1)&&str3.charAt(3)!='N')
+//                return true;
+//        else if(tilePlacementStringA.charAt(3)==tilePlacementStringB.charAt(3)&&tilePlacementStringA.charAt(2)==tilePlacementStringB.charAt(2)-1&&str3.charAt(2)==str4.charAt(0)&&str3.charAt(2)!='N')
+//                return true;
+//        else if(str3.charAt(2)==str4.charAt(0)&&str3.charAt(0)==str4.charAt(2)&&tilePlacementStringA.charAt(3)==tilePlacementStringB.charAt(3)&&str3.charAt(2)!='N'&&str3.charAt(0)!='N'&&(tilePlacementStringA.charAt(2)==tilePlacementStringB.charAt(2)+1||tilePlacementStringA.charAt(2)==tilePlacementStringB.charAt(2)-1))
+//            return true;
+//        else if(str3.charAt(1)==str4.charAt(3)&&str3.charAt(3)==str4.charAt(1)&&tilePlacementStringA.charAt(2)==tilePlacementStringB.charAt(2)&&str3.charAt(1)!='N'&&str3.charAt(3)!='N'&&(tilePlacementStringA.charAt(3)==tilePlacementStringB.charAt(3)+1||tilePlacementStringA.charAt(3)==tilePlacementStringB.charAt(3)-1))
+//            return true;
+//        else
+//            return false;
     }
 
     /**
@@ -64,11 +167,167 @@
      *
      * @param boardString a board string representing some placement sequence
      * @return true if placement sequence is valid
+     * @author Jesse Shen_u6718946
      */
     public static boolean isValidPlacementSequence(String boardString) {
         // FIXME Task 6: determine whether the given placement sequence is valid
-        return false;
-    }
+
+        String[] board=new String[boardString.length()/5];
+        for (int i=0,j=0;i<boardString.length();i=i+5,j++){
+            board[j]=boardString.substring(i+2,i+4);
+        }
+        for (int i=0;i<board.length;i++){
+            for (int j=i+1;j<board.length;j++)
+                if (board[i].equals(board[j])){
+                    return false;
+                }
+        }
+
+
+        if (isBoardStringWellFormed(boardString)){
+            int amount = (boardString.length()/5);
+            String s=boardString.substring(2,4);
+            if (!(s.equals("A1")||s.equals("A3")||s.equals("A5")||s.equals("B0")||s.equals("B6")||s.equals("D0")||s.equals("D6")||s.equals("F0")||s.equals("F6")||s.equals("G1")||s.equals("G3")||s.equals("G5"))){
+                return false;
+            }
+
+              loop2:
+                for (int i = 0;i<(amount);i++){
+                    loop1:
+                    for (int j = i;j>=0;j--){
+                            String tile1 = boardString.substring((0+i*5),(5+i*5));
+                            String tile2 = boardString.substring((0+j*5),(5+j*5));
+                            String con = Tile.tileReset(tile1);
+                            String con1 = Tile.tileReset(tile2);
+                            char ro = tile1.charAt(2);
+                            char co = tile1.charAt(3);
+                            char ro2 = tile2.charAt(2);
+                            char co2 = tile2.charAt(3);
+                        if (isTilePlacementWellFormed(tile1)){
+
+                                //String tile3 = allTiles.get(i).toString();
+
+                                if (ro=='A'&&co=='1'){
+                                    if (con.charAt(0)=='R') return false;
+                                }
+                                else if (ro=='A'&&co=='3'){
+                                    if (con.charAt(0)=='H') return false;
+                                }
+                                else if (ro=='A'&&co=='5'){
+                                    if (con.charAt(0)=='R') return false;
+                                }
+                                else if (ro=='B'&&co=='0'){
+                                    if (con.charAt(1)=='H') return false;
+                                }
+                                else if (ro=='B'&&co=='6'){
+                                    if (con.charAt(3)=='H') return false;
+                                }
+                                else if (ro=='D'&&co=='0'){
+                                    if (con.charAt(1)=='R') return false;
+                                }
+                                else if (ro=='D'&&co=='6'){
+                                    if (con.charAt(3)=='R') return false;
+                                }
+                                else if (ro=='F'&&co=='0'){
+                                    if (con.charAt(1)=='H') return false;
+                                }
+                                else if (ro=='F'&&co=='6'){
+                                    if (con.charAt(3)=='H') return false;
+                                }
+                                else if (ro=='G'&&co=='1'){
+                                    if (con.charAt(2)=='R') return false;
+                                }
+                                else if (ro=='G'&&co=='3'){
+                                    if (con.charAt(2)=='H') return false;
+                                }
+                                else if (ro=='G'&&co=='5'){
+                                    if (con.charAt(2)=='R') return false;
+                                }
+                                else if(tile1.equals(tile2)){
+                                    break;
+                                }
+                                else if (((ro==ro2)&&(co==(co2-1)))||((ro==ro2)&&(co==(co2+1)))||((co==co2)&&(ro==(ro2-1)))||((co==co2)&&(ro==(ro2+1)))) {
+                                    if (areConnectedNeighbours(tile1, tile2)) {
+                                        break loop1 ;
+                                    }
+
+
+                                }
+
+                        }
+                        else {
+                            return false;
+                        }
+                    }
+                }
+
+
+        }
+        else {
+            return false;
+        }
+        String str1 = new String();
+        List<String> piece0 = Viewer.breakPlacementStringToPieces(boardString);
+        int tilenumber = boardString.length()/5;
+
+        String[] StrA = new String[tilenumber];
+        String[] StrB = new String[tilenumber];
+        String[] StrC = new String[tilenumber];
+        for (int i = 0; i<tilenumber;i++){
+            StrA[i] = piece0.get(i);
+            StrC[i] = piece0.get(i);
+            StrB[i] = "";
+        }
+        for (int i=0;i<tilenumber;i++){
+            for (int j=0;j<(i+1);j++) {
+                int flag1 =0;
+                if (IsConnectExit(StrA[i])){
+                    flag1 = 1;
+                }
+                for (int l=0;l<(i+1);l++){
+                    if (areConnectedNeighbours(StrA[i],StrC[l])){
+                        flag1 = 1;
+                    }
+                }
+                if (flag1==0){
+                    return false;
+                }
+                char[] chars1=StrA[i].toCharArray();
+                char[] chars2=StrC[j].toCharArray();
+                String string1 = Tile.tileReset(StrA[i]);
+                char[] chars3 = string1.toCharArray();
+                String string2 = Tile.tileReset(StrC[j]);
+                char[] chars4 = string2.toCharArray();
+
+                if (chars1[2] == chars2[2] + 1&&chars1[3]==chars2[3]) {
+                            if ((chars3[0]=='H'&&chars4[2]=='R')||(chars3[0]=='R'&&chars4[2]=='H')) {
+                                return false;
+
+                            }
+                        }
+                        else if (chars1[2]==chars2[2]-1&&chars1[3]==chars2[3]){
+                            if ((chars3[2]=='H'&&chars4[0]=='R')||(chars3[2]=='R'&&chars4[0]=='H')) {
+                                return false;
+
+                            }
+                        }
+                        else if (chars1[3]==chars2[3]+1&&chars1[2]==chars2[2]){
+                            if ((chars3[1]=='R'&&chars4[3]=='H')||(chars3[1]=='H'&&chars4[3]=='R')) {
+                                return false;
+
+                            }
+                        }
+                        else if (chars1[3]==chars2[3]-1&&chars1[2]==chars2[2]){
+                            if ((chars3[3]=='R'&&chars4[1]=='H')||(chars3[3]=='H'&&chars4[1]=='R')) {
+                                return false;
+
+                            }
+                        }
+
+                }
+            }
+
+        return true;}
 
     /**
      * Generate a random dice roll as a string of eight characters.
@@ -80,11 +339,46 @@
      *
      * @return a String representing the die roll e.g. A0A4A3B2
      */
+    /**
+     written by u6801714 Jiamin Dai
+     **/
     public static String generateDiceRoll() {
         // FIXME Task 7: generate a dice roll
-        return "";
+        Random rand=new Random();
+        return "A"+rand.nextInt(6)+"A"+rand.nextInt(6)+"A"+rand.nextInt(6)+"B"+rand.nextInt(3);
     }
 
+    public static Boolean IsConnectExit(String tilepiece){
+        if (tilepiece=="") return false;
+        else {
+            char[] chars0 = tilepiece.toCharArray();
+            if ((chars0[2] == 'A' && chars0[3] == '1') || (chars0[2] == 'A' && chars0[3] == '3') || (chars0[2] == 'A' && chars0[3] == '5') || (chars0[2] == 'B' && chars0[3] == '0') || (chars0[2] == 'B' && chars0[3] == '6') || (chars0[2] == 'D' && chars0[3] == '0') || (chars0[2] == 'D' && chars0[3] == '6') || (chars0[2] == 'F' && chars0[3] == '0') || (chars0[2] == 'F' && chars0[3] == '6') || (chars0[2] == 'G' && chars0[3] == '1') || (chars0[2] == 'G' && chars0[3] == '3') || (chars0[2] == 'G' && chars0[3] == '5')){
+                return true;
+            }
+            else {
+                return false;
+            }
+        }
+
+    }
+
+//    public static Boolean IsEndAtEdge(String tilepiece){
+//        char[] chars = tilepiece.toCharArray();
+//        String Connection = Tile.tileReset(tilepiece);
+//        char[] chars1 = Connection.toCharArray();
+//
+//        if (chars[2]=='A'&&chars1[0]!='N') return true;
+//        else if (chars[2]=='G'&&chars1[2]!='N') return true;
+//        if (chars[3]=='0'&&chars1[1]!='N') return true;
+//        else if ()
+//    }
+
+    public String KindofRoad(String StrA,String StrB){
+        char[] chars = StrA.toCharArray();
+        String road = new String();
+
+        return  road;
+    }
     /**
      * Given the current state of a game board, output an integer representing the sum of all the following factors
      * that contribute to the player's final score.
@@ -95,10 +389,161 @@
      *
      * @param boardString a board string representing a completed game
      * @return integer (positive or negative) for score *not* considering longest rail/highway
+     * @author Jesse Shen_u6718946
      */
     public static int getBasicScore(String boardString) {
         // FIXME Task 8: compute the basic score
-        return -1;
+        int score = 0;
+        List<String> piece0 = new ArrayList<>();
+        String str1 = new String();
+        int ExitNum = 0;
+        int ErrorNum = 0;
+        piece0 = Viewer.breakPlacementStringToPieces(boardString);
+        int tilenumber = boardString.length()/5;
+
+
+        for (int i = 0;i<piece0.size();i++){
+            String tile1 = piece0.get(i);
+            char[] t1 = tile1.toCharArray();
+            if (t1[2]=='C'||t1[2]=='D'||t1[2]=='E') {
+                if (t1[3] == '2'||t1[3] == '3'||t1[3]=='4') {
+                    score++;
+                }
+            }
+        }
+        System.out.println("score: "+score);
+
+
+
+
+        String[] StrA = new String[tilenumber];
+        String[] StrB = new String[tilenumber];
+        String[] StrC = new String[tilenumber];
+        for (int i = 0; i<tilenumber;i++){
+            StrA[i] = piece0.get(i);
+            StrC[i] = piece0.get(i);
+            StrB[i] = "";
+        }
+
+        for (int i=0;i<tilenumber;i++){
+            String direction = Tile.tileReset(StrA[i]);
+            char[] d1 = direction.toCharArray();
+            int errorSide = 4;
+            char[] chars0 = StrA[i].toCharArray();
+            if (chars0[2]=='A'||chars0[2]=='G'){
+                errorSide--;
+            }
+            if (chars0[3]=='0'||chars0[3]=='6'){
+                errorSide--;
+            }
+            for (int j=0;j<4;j++){
+                if (d1[j]=='N'){
+                    if (j==0&&chars0[2]=='A'){
+                        errorSide=errorSide+0;
+                    }
+                    else if (j==1&&chars0[3]=='0'){
+                        errorSide=errorSide+0;
+                    }
+                    else if (j==2&&chars0[2]=='G'){
+                        errorSide=errorSide+0;
+                    }
+                    else if (j==3&&chars0[3]=='6'){
+                        errorSide=errorSide+0;
+                    }
+                    else {
+                        errorSide--;
+                    }
+                }
+            }
+            for (int k=0;k<tilenumber;k++){
+                if (RailroadInk.areConnectedNeighbours(StrA[i],StrC[k])) errorSide--;
+            }
+//            if (errorSide>0){
+//                System.out.println(StrA[i]);
+//            }
+//            System.out.println("ErrorNum: "+ErrorNum);
+            ErrorNum = ErrorNum+errorSide;
+        }
+
+        for (int i=0;i<tilenumber;i++){
+            if (StrA[i]!="") {
+                if (RailroadInk.IsConnectExit(StrA[i])) {
+//                    ExitNum++;
+                StrB[i] = StrA[i];
+                StrA[i] = "";
+                for (int j = 0; j < tilenumber; j++) {
+                    for (int k=0;k<tilenumber;k++){
+                        if (RailroadInk.areConnectedNeighbours(StrB[j], StrA[k])) {
+                            if (RailroadInk.IsConnectExit(StrA[k])) {
+                                char[] charsB = StrB[j].toCharArray();
+                                char[] charsA = StrA[k].toCharArray();
+                                if (charsB[0]=='B'&&charsB[1]=='2'){
+                                    String string = Tile.tileReset(StrB[j]);
+                                    char[] chars2 = string.toCharArray();
+                                    char connectroad = 0;
+                                    if (charsB[2]==charsA[2]+1&&charsA[3]==charsB[3]) {
+                                        connectroad = chars2[0];
+                                    }
+                                    else if (charsB[3]==charsA[3]+1&&charsA[2]==charsB[2]) {
+                                        connectroad = chars2[1];
+                                    }
+                                    else if (charsB[2]==charsA[2]-1&&charsA[3]==charsB[3]) {
+                                        connectroad = chars2[2];
+                                    }
+                                    else if (charsB[3]==charsA[3]-1&&charsA[2]==charsB[2]) {
+                                        connectroad = chars2[3];
+                                    }
+                                    else {
+                                        connectroad = 'N';
+                                    }
+
+                                    for (int m=0;m<tilenumber;m++){
+                                        if (RailroadInk.IsConnectExit(StrB[m])){
+                                            char roadkind = 0;
+                                            char[] chars = StrB[m].toCharArray();
+                                            if ((chars[2]=='A'&&chars[3]=='1')||(chars[2]=='A'&&chars[3]=='5')||(chars[2]=='D'&&chars[3]=='0')||(chars[2]=='D'&&chars[3]=='6')||(chars[2]=='G'&&chars[3]=='5')||(chars[2]=='G'&&chars[3]=='1')){
+                                                roadkind = 'H';
+                                            }
+                                            else if ((chars[2]=='A'&&chars[3]=='3')||(chars[2]=='B'&&chars[3]=='0')||(chars[2]=='B'&&chars[3]=='6')||(chars[2]=='F'&&chars[3]=='0')||(chars[2]=='F'&&chars[3]=='6')||(chars[2]=='G'&&chars[3]=='3')){
+                                                roadkind = 'R';
+                                            }
+
+                                            if (roadkind==connectroad){
+                                                StrB[k] = StrA[k];
+                                                StrA[k] = "";
+                                                j=0;
+                                                break;
+                                            }
+                                        }
+                                    }
+                                }
+                            }
+                            StrB[k] = StrA[k];
+                            StrA[k] = "";
+                            j=0;
+                        }
+                    }
+
+                     }
+
+                }
+                for (int h=0;h<tilenumber;h++){
+                    if (RailroadInk.IsConnectExit(StrB[h])){
+                        ExitNum++;
+                    }
+                }
+                score = score + 4 * (ExitNum - 1);
+                ExitNum = 0;
+                for (int l=0;l<tilenumber;l++){
+                    StrB[l]="";
+                }
+            }
+
+        }
+
+        score = score-ErrorNum;
+
+        return score;
     }
 
     /**
@@ -111,7 +556,10 @@
      */
     public static String generateMove(String boardString, String diceRoll) {
         // FIXME Task 10: generate a valid move
-        return null;
+        ArrayList<String> dice=Tile.generateTile(diceRoll);
+        ArrayList<String> board=Tile.generateboard(boardString);
+
+        return "S4A42";
     }
 
     /**
@@ -128,5 +576,7 @@
         // FIXME Task 12: compute the total score including bonus points
         return -1;
     }
+
+
 }
 
Only in comp1110-ass2/src/comp1110/ass2: Tile.class
Only in comp1110-ass2/src/comp1110/ass2: Tile.java
Only in comp1110-ass2/src: gittest
Only in comp1110-ass2/src: META-INF
Only in comp1110-ass2/tests/comp1110/ass2: JesseTest.java
Only in comp1110-ass2/tests/comp1110/ass2: TileTest.java
```
## Test log
```
--javac output--
Note: comp1110-ass2/src/comp1110/ass2/RailroadInk.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
----
JUnit version 4.12
...
Time: 0.053

OK (3 tests)

JUnit version 4.12
......
Time: 0.054

OK (6 tests)

JUnit version 4.12
.....
Time: 0.035

OK (5 tests)

JUnit version 4.12
.....
Time: 0.237

OK (5 tests)

JUnit version 4.12
....
Time: 0.111

OK (4 tests)

JUnit version 4.12
.score: 7
Sample game A3D61A3D53B0C52A0B52A2B63A4D41B0E60A0F61A3D31A3D23A2G30B0F34A3E32A1B01B2B10A1B21A0A63A4D01A1G41B0G12S2D10A4C10B2A10A2B33A1A30S4E11A4E21A3C21A3C31S5F11
score 20
E.score: 0
.score: 6
E.score: 1

Time: 0.181
There were 2 failures:
1) testSampleGames(comp1110.ass2.GetBasicScoreTest)
java.lang.AssertionError: Sample game including networks connecting [7, 2] exits covering 7 centre squares with 11 errors: expected total score 24 but RailroadInk.getBasicScore returned total score: 20
	at org.junit.Assert.fail(Assert.java:88)
	at org.junit.Assert.assertTrue(Assert.java:41)
	at comp1110.ass2.GetBasicScoreTest.testSampleGames(GetBasicScoreTest.java:67)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:298)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:292)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.lang.Thread.run(Thread.java:834)
2) testFullGameExample(comp1110.ass2.GetBasicScoreTest)
java.lang.AssertionError: Sample game including networks connecting [6, 4] exits covering 6 centre squares with 5 errors: expected total score 33 but RailroadInk.getBasicScore returned total score: 37
	at org.junit.Assert.fail(Assert.java:88)
	at org.junit.Assert.assertTrue(Assert.java:41)
	at comp1110.ass2.GetBasicScoreTest.testFullGameExample(GetBasicScoreTest.java:57)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:298)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:292)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.lang.Thread.run(Thread.java:834)

FAILURES!!!
Tests run: 4,  Failures: 2

JUnit version 4.12
..E.E.E.E
Time: 0.034
There were 4 failures:
1) testTwoOptions(comp1110.ass2.GenerateMoveTest)
java.lang.AssertionError: RailroadInk.generateMove("A4A10A1A30A4A50S1B32A1B01A1B61B2B10A1B21S5B50A1B41A4D01A4D61A3D12B0C30A3D50A4C10A4C50A1F01A1F61A4G10B1F12A4G50B1E10A1E21A3E52B1F56S4E31", "A1A1A4B0") returned invalid move: S4A42
	at org.junit.Assert.fail(Assert.java:88)
	at org.junit.Assert.assertTrue(Assert.java:41)
	at comp1110.ass2.GenerateMoveTest.testMove(GenerateMoveTest.java:79)
	at comp1110.ass2.GenerateMoveTest.testTwoOptions(GenerateMoveTest.java:61)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:298)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:292)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.lang.Thread.run(Thread.java:834)
2) testOneExit(comp1110.ass2.GenerateMoveTest)
java.lang.AssertionError: RailroadInk.generateMove("A0F00A0B00A0A30B1A10A0B61A0F61A0G32B1D61A0G43A0A62A0E61B1G56S1G60S5A20A0E03A0A03B1G12A0G02S0A50A0B50A0B41B1A41", "A0A0A0B1") returned invalid move: S4A42
	at org.junit.Assert.fail(Assert.java:88)
	at org.junit.Assert.assertTrue(Assert.java:41)
	at comp1110.ass2.GenerateMoveTest.testMove(GenerateMoveTest.java:79)
	at comp1110.ass2.GenerateMoveTest.testOneExit(GenerateMoveTest.java:49)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:298)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:292)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.lang.Thread.run(Thread.java:834)
3) testManyOptions(comp1110.ass2.GenerateMoveTest)
java.lang.AssertionError: RailroadInk.generateMove("A4A50A0B61A3D60B1F60S0E61A0E52A5G52A4G61B2B50A0A30A1A21A5A10B2G31A3G41B0G12A0F13A2F01S1D03A2B02A1C00B0A00A3G21S3G00A1E00A4C50B1D50A0F51", "A5A5A5B1") returned invalid move: S4A42
	at org.junit.Assert.fail(Assert.java:88)
	at org.junit.Assert.assertTrue(Assert.java:41)
	at comp1110.ass2.GenerateMoveTest.testMove(GenerateMoveTest.java:79)
	at comp1110.ass2.GenerateMoveTest.testManyOptions(GenerateMoveTest.java:72)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:298)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:292)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.lang.Thread.run(Thread.java:834)
4) testNoExits(comp1110.ass2.GenerateMoveTest)
java.lang.AssertionError: RailroadInk.generateMove("A5D00A0B03A0A30B1A10S3A20A0F03A0G32A5G53B1F60A5D61A0B61A0G43B1A54S1A40A0B40A0B31S4A60A5C62B1G12A0G01A0C00A5E62B1B23", "A0A0A5B1") returned invalid move: S4A42
	at org.junit.Assert.fail(Assert.java:88)
	at org.junit.Assert.assertTrue(Assert.java:41)
	at comp1110.ass2.GenerateMoveTest.testMove(GenerateMoveTest.java:79)
	at comp1110.ass2.GenerateMoveTest.testNoExits(GenerateMoveTest.java:38)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:298)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:292)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.lang.Thread.run(Thread.java:834)

FAILURES!!!
Tests run: 5,  Failures: 4

JUnit version 4.12
.Sample game A3D61A3D53B0C52A0B52A2B63A4D41B0E60A0F61A3D31A3D23A2G30B0F34A3E32A1B01B2B10A1B21A0A63A4D01A1G41B0G12S2D10A4C10B2A10A2B33A1A30S4E11A4E21A3C21A3C31S5F11
score -1
E.E
Time: 0.03
There were 2 failures:
1) testSampleGames(comp1110.ass2.GetAdvancedScoreTest)
java.lang.AssertionError: Sample game including networks connecting [7, 2] exits covering 7 centre squares with 11 errors longest railway 5 longest road 12: expected total score 41 but RailroadInk.getAdvancedScore returned total score: -1
	at org.junit.Assert.fail(Assert.java:88)
	at org.junit.Assert.assertTrue(Assert.java:41)
	at comp1110.ass2.GetAdvancedScoreTest.testSampleGames(GetAdvancedScoreTest.java:26)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:298)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:292)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.lang.Thread.run(Thread.java:834)
2) testFullGameExample(comp1110.ass2.GetAdvancedScoreTest)
java.lang.AssertionError: Sample game including networks connecting [6, 4] exits covering 6 centre squares with 5 errors longest railway 5 longest road 8: expected total score 46 but RailroadInk.getAdvancedScore returned total score: -1
	at org.junit.Assert.fail(Assert.java:88)
	at org.junit.Assert.assertTrue(Assert.java:41)
	at comp1110.ass2.GetAdvancedScoreTest.testFullGameExample(GetAdvancedScoreTest.java:16)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:298)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:292)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.lang.Thread.run(Thread.java:834)

FAILURES!!!
Tests run: 2,  Failures: 2

```
