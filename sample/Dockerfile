# 第一ステージ: Gradleを使用してWARファイルをビルド
FROM gradle:8.9.0-jdk17 AS build

# 作業ディレクトリを設定
WORKDIR /work

# ソースファイルをコピー
COPY . /work

# ビルド
RUN gradle clean build --no-daemon

# 第二ステージ: Tomcatを使用してWARファイルをデプロイ
FROM tomcat:10.1.26-jdk17

# 作業ディレクトリを設定
WORKDIR /usr/local/tomcat

# warファイルをコピー
COPY --from=build /work/build/libs/sample-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/sample.war

# ポート指定
EXPOSE 8080

# 実行
CMD ["catalina.sh", "run"]