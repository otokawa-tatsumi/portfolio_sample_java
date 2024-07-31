## 開発環境
vscode上での開発を想定している

## 事前準備
1. java17インストール
    ```bash
    sudo apt-get update
    sudo apt-get install openjdk-17-jdk
    ```
2. 本リポジトリをcloneする
    ```bash
    git clone https://github.com/otokawa-tatsumi/portfolio_sample_java.git
    ```
3. vscodeでワークスペースを開く
    - ファイル -> ファイルでワークスペースを開く -> .vscode/portfolio_sample_java.code-workspaceを選択
4. vscodeに以下の拡張機能をインストール
    - Extension Pack for Java
    - Spring Boot Extension Pack

## 開発方法
1. 開発用DBの開始
    ```bash
    make up-db
    ```
2. 開発用DBの終了
    ```bash
    make up-db
    ```