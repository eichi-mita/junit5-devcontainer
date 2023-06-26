# Junit5 Dev Container

Junit5の実行環境をVisual Studio CodeのDev Containerを使用して構築します

## セットアップ
- いずれかのDocker環境がローカルで起動していること
  - [Rancher Desktop](https://rancherdesktop.io/)
  - [Multipass](https://kurupeku.github.io/hello-golang/multipass.html)
- [Visual Studio Code](https://azure.microsoft.com/ja-jp/products/visual-studio-code)がインストールされていること
- [Remote Development](https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.vscode-remote-extensionpack)がインストールされていること

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

- `Do you want to install the recommended 'Extension Pack for Java' extension from Microsoft for this repository?` の右下に出てくるダイアログは無視して大丈夫です
- `Folder contains a Dev Container configuration file. Reopen folder to develop in a container (learn more). Or: Clone repository in Docker volume for better I/O performance.`ダイアログの`Reopen in container`からコンテナを起動してください
    - または、左下の青い`><`アイコンをクリックし、`Reopen in container`を選択してコンテナを起動してください
- しばらく待つとコンテナが起動します
```
% docker ps
CONTAINER ID   IMAGE                                                                                        COMMAND                   CREATED          STATUS          PORTS     NAMES
bb6a3b429081   vsc-tdd-bootcamp-3831fdb6707d0cbca31f5d76b38476e6f59389e842f6fdf02dd08837576b7296-features   "/bin/sh -c 'echo Co…"   23 seconds ago   Up 21 seconds             romantic_torvalds
```
- 起動し切るまでちょっと掛かります
    - src/test/java/TodoTest.javaを開いておいて、テスト実行ボタンが表示されたら使える状態です
       - 試しに実行ボタンを押してみてください。テストが実行されるはずです

