# 1) Build stage: 모든 소스 컴파일
FROM eclipse-temurin:17-jdk-alpine AS build
WORKDIR /work
COPY src ./src

# 디버그: 실제로 복사된 .java 목록 출력 (빌드 로그에서 확인 가능)
RUN echo "== Java sources ==" && find src -type f -name '*.java' -print

# src 내 모든 .java를 찾아 out/에 컴파일
RUN mkdir -p out \
 && javac -encoding UTF-8 -d out $(find src -type f -name '*.java')

# 2) Runtime stage
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# 컴파일된 모든 클래스 복사
COPY --from=build /work/out/ /app/

ENV LANG=C.UTF-8 LC_ALL=C.UTF-8

# ▼ 메인 클래스 지정
# 패키지가 없다면:
ENTRYPOINT ["java","-cp","/app","LabelBreakExample"]

# 만약 소스에 package가 있다면(예: package example.individual;)
# 위 한 줄을 아래로 바꿔주세요:
# ENTRYPOINT ["java","-cp","/app","example.individual.LabelBreakExample"]
