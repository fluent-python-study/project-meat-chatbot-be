# 도커를 이용해 로컬 환경에서 데이터베이스 설정하기
1. `cd {project-root}/project-meat-chatbot-be/docker` 명령어를 실행해 `Dockerfile`이 위치한 경로로 이동합니다.
2. `docker build -t {repository}:1.0.0 -t {repository}:latest --build-arg PASSWORD={passowrd} .` 명령어를 이용해 이미지를 빌드합니다.   
    <table>
        <thead>
            <tr>
                <td>인자 및 옵션</td>
                <td>설명</td>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>[인자] Dockerfile이 위치한 경로</td>
                <td>필수 인자로 위 명령어의 <code>.</code>입니다.</td>
            </tr>
            <tr>
                <td>[옵션] <code>-t</code></td>
                <td>
                    이미지의 태그를 지정합니다. <code>e.g. projectmeatdb</code> <br/>
                    <code>docker images</code> 명령어를 통해 확인할 수 있습니다. <br/>
                    여러 번을 사용해 한 번에 여러 개의 태그를 설정할 수 있습니다. <br/>
                    <code>:latest</code>를 사용할 경우 <code>{repository}</code>만으로도 사용할 수 있습니다.
                </td>
            </tr>   
            <tr>
                <td>[옵션] <code>--build-arg</code></td>
                <td><code>{argument-name}={argument-value} 형식으로 Dockerfile의 ARG를 오버라이딩합니다.</code></td>
            </tr>
        </tbody>
    </table>
3. `docker images`로 이미지 빌드 여부를 확인합니다.
4. 3번으로 image가 정상적으로 빌드된 것을 확인하면, `docker run -p {local-port}:3306 --name {container-name} -d {repository:tag}` 명령어를 실행해 컨테이너를 생성합니다.   
   <table>
        <thead>
            <tr>
                <td>인자 및 옵션</td>
                <td>설명</td>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>[인자] 이미지</td>
                <td>
                    컨테이너를 생성할 이미지명을 지정해줍니다<br/>
                    2번에서 예시와 같이 projectmeatdb라고 명명하고, 1.0.0과 latest 태그를 설정했다면,<br/>
                    projectmeatdb 또는 projectmeatdb:1.0.0을 기입하면 됩니다.
                </td>
            </tr>
            <tr>
                <td>[옵션] <code>-p</code></td>
                <td>
                    로컬의 포트를 포워딩해주는 옵션입니다.<br/>
                    <code>:</code> 뒷 부분은 컨테이너의 포트인데, Dockerfile에 EXPOSE를 통해 지정되어 있습니다.
                </td>
            </tr>
            <tr>
                <td>[옵션] <code>--name</code></td>
                <td>컨테이너 이름을 지정해주는 옵션입니다.</td>
            </tr>
            <tr>
                <td>[옵션] <code>-d</code></td>
                <td>백그라운드로 컨테이너를 실행하는 명령어입니다.</td>
            </tr>
        </tbody>
   </table>
5. `docker ps`를 통해 컨테이너 실행 여부를 확인할 수 있습니다.