set /p dt=请输入提交信息:
if "%dt%" == "" (
	set dt=%Date:~0,4%-%Date:~5,2%-%Date:~8,2%
)
git add -A
git add *
git commit -m %dt%
git reflog expire --expire=now --all
git gc --prune=now
git push origin master
pause