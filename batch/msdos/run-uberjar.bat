md "%HOMEPATH%\_delete_content\"
pushd %~dp0\..\..
call java -cp .\target\uberjar\bgames-uberjar.jar pl.tomaszgigiel.bgames.core
pause
popd
