# Junit5 Dev Container

Junit5の実行環境をVisual Studio CodeのDev Containerを使用して構築します

## セットアップ
- いずれかのDocker環境がローカルで起動していること
  - [Rancher Desktop](https://rancherdesktop.io/)
  - [Multipass](https://kurupeku.github.io/hello-golang/multipass.html)
- [Visual Studio Code](https://azure.microsoft.com/ja-jp/products/visual-studio-code)がインストールされていること
- [Remote Development 拡張機能](https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.vscode-remote-extensionpack)がインストールされていること

- 仕組みとしては、ローカルのVSCodeからコンテナに接続して開発するイメージです。
  - JavaのランタイムやVSCodeの拡張機能はコンテナに内蔵されているため、各自の環境を汚さない、かつJavaを知らなくても簡単に環境構築することができます。

![image](https://github.com/eichi-mita/junit5-devcontainer/assets/120150437/39cbd772-fac7-425c-9c89-5dd7ed14a4ab)

## 使用方法
- このリポジトリをローカルの任意のディレクトリにcloneします
  ```
  git clone https://github.com/eichi-mita/junit5-devcontainer.git
  ```
- Visual Studio Codeでcloneしたディレクトリを開きます
  ```
  cd junit5-devcontainer
  code .
  ```

- `お勧めの'Extension Pack for Java'をインストールしますか？` と右下に出てくるダイアログは無視して大丈夫です（何回か出てくると思いますが毎回無視で）

![image](https://github.com/eichi-mita/junit5-devcontainer/assets/120150437/7e9f914e-ea95-414b-8d89-1259f8c7027b)

- `Folder contains a Dev Container configuration file. Reopen folder to develop in a container (learn more). Or: Clone repository in Docker volume for better I/O performance.`ダイアログの`Reopen in container`をクリックしてください。コンテナが起動します。

![image](https://github.com/eichi-mita/junit5-devcontainer/assets/120150437/52af32db-2b96-4718-b50a-2fd8d562f969)

- ダイアログが消えてしまった場合などは、左下の青い`><`アイコンをクリックし、`Reopen in container`を選択してコンテナを起動してください

![image](https://github.com/eichi-mita/junit5-devcontainer/assets/120150437/44912a7a-f1c4-482a-8351-f6e8455a029f)

- しばらく待つとこんな名前のコンテナが起動します（不要になったら docker rm で削除してください）

```
% docker ps
CONTAINER ID   IMAGE                                                                                        COMMAND                   CREATED          STATUS          PORTS     NAMES
bb6a3b429081   vsc-tdd-bootcamp-3831fdb6707d0cbca31f5d76b38476e6f59389e842f6fdf02dd08837576b7296-features   "/bin/sh -c 'echo Co…"   23 seconds ago   Up 21 seconds             romantic_torvalds
```
- 起動し切るまでちょっと掛かります
    - サンプルとして置いている`src/test/java/TodoTest.java`を開いておいて、テスト実行ボタンが表示されたら使える状態です

![image](https://github.com/eichi-mita/junit5-devcontainer/assets/120150437/6df68a0b-ae22-4ea1-a14c-15704e505e1b)


- 試しに実行ボタンを押してみてください。テストが実行されるはずです。これでセットアップ完了です。

![image](https://github.com/eichi-mita/junit5-devcontainer/assets/120150437/40bef715-9ec7-4765-ae94-15b94b94463a)

- 終了したい時は　左下の青い`><`アイコンをクリックし、　`Close Remote Connection`を選択してください。

