# TEST_AVD
AVD ( animated vector drawable ) XML 포멧 테스트 파일입니다.

안드로이드 AVD XML 애니메이션 파일을 테스트 해볼 수 있는 프로젝트 파일입니다.

적용방식은 제작한 xml 파일을 그래픽 폴더로 붙혀넣기 후 네이밍 수정만으로 안드로이드 앱에서 프리뷰 할 수 있는 프로젝트입니다.

[프로젝트 샘플영상]

![sample](https://user-images.githubusercontent.com/21286823/174946672-c66bba9d-be9f-4ba9-b957-48fcf10d78b7.gif)

_
# 적용 방법

1. 파일 적용방식은 Code탭 클릭 > Copy (자동으로 url이 복사) > 안드로이드 스튜디오 실행 후 
GET FROM VCS > URL 붙혀넣기 클론하게 되면 내 하드디스크에 프로젝트 파일이 복사 됩니다.
<img width="770" alt="" src="https://user-images.githubusercontent.com/21286823/174949454-ebad7e10-68ee-44d9-8ef6-bc43e94d5529.png">

2. 프로젝트 실행
<img width="770" alt="" src="https://user-images.githubusercontent.com/21286823/174952941-1c7420df-6dac-4429-89da-8dca8b3ce7a1.png">

3. res/drawable 폴더 우클릭 후 Open In > Finder 폴더에 xml 파일을 붙혀넣기   
<img width="770" alt="" src="https://user-images.githubusercontent.com/21286823/174947981-4ab02777-fcfd-4b57-aa53-9aa18275c2e7.png">

4.actiivity.xml 파일 오픈

<img width="330" alt="" src="https://user-images.githubusercontent.com/21286823/174951225-2d313f88-8c87-4882-bbd0-526ec38671ed.png">

5. 두가지 케이스가 있는데 id="xml_anim_t1" 에 적용하는 파일은 한번 재생되는 타입(ON/OFF -> X) id="xml_anim_t2" 에 적용하는 파일은 파일 2개로 재생되는 타입(ON/OFF -> O)

<img width="770" alt="" src="https://user-images.githubusercontent.com/21286823/174952732-c69b94ea-74da-43b7-8175-ec54f68ee893.png">

6. xml_anim_t2 타입은 파일 2개로 재생되는 타입인 만큼 on/off 애니메이션 경로를 지정해 주어야 실행이 가능합니다.

<img width="770" alt="" src="https://user-images.githubusercontent.com/21286823/174953311-998bd70f-fa83-4fa4-bcb2-8fb8cc0f70e0.png">

#

적용하시면서 궁금하거나 기능이 추가 되어야 할 내용을 전달주시면 업데이트 할 수 있도록 하겠습니다.
