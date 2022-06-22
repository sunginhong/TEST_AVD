# TEST_AVD
AVD ( animated vector drawable ) XML 포멧 테스트 파일입니다.

![sample](https://user-images.githubusercontent.com/21286823/174946672-c66bba9d-be9f-4ba9-b957-48fcf10d78b7.gif)

안드로이드 AVD XML 애니메이션 파일을 테스트 해볼 수 있는 프로젝트 파일입니다.

_
# 적용 방법

1. 파일 적용방식은 Code탭 클릭 > Copy (자동으로 url이 복사) > 안드로이드 스튜디오 실행 후 
GET FROM VCS > URL 붙혀넣기 클론하게 되면 내 하드디스크에 프로젝트 파일이 복사 됩니다.
<img width="770" alt="" src="https://user-images.githubusercontent.com/21286823/174949454-ebad7e10-68ee-44d9-8ef6-bc43e94d5529.png">

2. 프로젝트 실행
<img width="770" alt="" src="https://user-images.githubusercontent.com/21286823/174950586-f0b82ab7-830b-49f7-b46b-86adfe027f5f.png">

3. res/drawable 폴더 우클릭 후 Open In > Finder 폴더에 xml 파일을 붙혀넣기   
<img width="770" alt="" src="https://user-images.githubusercontent.com/21286823/174947981-4ab02777-fcfd-4b57-aa53-9aa18275c2e7.png">

4.actiivity.xml 파일 오픈

<img width="330" alt="" src="https://user-images.githubusercontent.com/21286823/174951225-2d313f88-8c87-4882-bbd0-526ec38671ed.png">

5. 두가지 케이스가 있는데 id="xml_anim_t1" 에 적용하는 파일은 한번 재생되는 타입(ON/OFF -> X) id="xml_anim_t2" 에 적용하는 파일은 파일 2개로 재생되는 타입(ON/OFF -> O)

<img width="770" alt="" src="https://user-images.githubusercontent.com/21286823/174951354-206e6f9c-201c-45bb-ad35-56a875d73c42.png">

6. xml_anim_t2 타입은 파일 2개로 재생되는 타입인 만큼 on/off 애니메이션 경로를 지정해 주어야 실행이 가능합니다.

<img width="770" alt="" src="https://user-images.githubusercontent.com/21286823/174951996-6ee49539-164f-4b56-ab40-02ec60db22be.png">

