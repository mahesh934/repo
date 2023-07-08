

GIT AND GITHUB

we have 3 stages 
1. working area
2. staging area
3. local repository


1. WORKING AREA
 
* Developer used to develop code 

* To move the working area to the staging area by using the ( git add file name ) command
* To move all the files at a time we use ( git add * ), ( git add . ), and ( git add -a ).

2. STAGING AREA

* After completion of moving the code from a working area then we are moving to the local repository 
* from stage2 to stage3 we move files by using some commands 
 ( git commit -m "new code and message" )
* to find where our code is used if our code is in the working area it shows in red color by using the command of ( git status )
* if our code is in green color it is in the staging area 

3. LOCAL REPOSITORY

* we get a file from the staging area 
* it will show automatically an error because this stage needs WHO YOU ARE 
* in this case we process the file by using commands 
  ( git config --global user email/who you are ) 
  ( git config --global user password )
NOTE: Here we need to check the status  for who sends files by using a command of ( git status )
       * it we get a red color it is in working 
       * it shows green color we can say there are in the staging area 

# if we know the 3 stages of the directory, simply using the command ( git log ) will show the commit id's and who 
  committed the code along with the time and date  
* git log --oneline ( it shows in sing line of commit id's )

GIT STACH

111
