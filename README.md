# IgniteTemplate

1.16.5 の Paperサーバー に Mixin を導入するためのテンプレートです。

このテンプレートでは [Ignite](https://github.com/vectrix-space/ignite) を使用して、Paperサーバー に Mixin を適用することが可能な「Mod」を作成することができます。  
(※ここでの「Mod」は Forge や Fabric の Mod とは関係がなく、Ignite の Mod を指します。)  

## Ignite を使用する理由

- Ignite は Paper のロード前に IgniteLauncher を挿入して Mixin を導入する仕組みであるため、`server.jar`や`patched_1.16.5.jar`を差し替える必要がなく導入が簡単です。
- Mod 単位でパッチが作成できるため、プラグイン感覚で複数の Mod を同時に導入することが可能です。
- Pterodactyl 上で問題なく Ignite を使用することができます。

## 本番環境での Ignite の起動方法

1. [IgniteLauncher](https://github.com/vectrix-space/ignite/releases) をダウンロードし、サーバーディレクトリに入れます。
2. サーバーディレクトリに`mods`フォルダを作成し、このテンプレートで作成した Mod を入れます。
3. 1.16.5 の paper をダウンロードし、`paper.jar`にリネームした上でサーバーディレクトリに入れます。
4. 以下の引数を追加してサーバーを起動することで、Mod に書かれた Mixin が適用された Paperサーバー を起動することができます。
```bat
java -javaagent:./ignite-launcher.jar -Dignite.service=legacy_paper -Dignite.paper.minecraft=1.16.5 -jar ignite-launcher.jar
```

## 開発環境の起動方法

1. `run`ディレクトリを作成し、以下ファイルを入れます。(リネームしてください)
    - [ignite-launcher.jar](https://github.com/vectrix-space/ignite/releases)
    - [paper.jar](https://papermc.io/legacy)
2. IDEA の起動構成から `DevBuild` を選択し、起動します。
    - 起動前に自動でビルドが行われ、`run/mods`に Mod がコピーされます。

## サンプルについて

[Ignite本家のサンプル](https://github.com/vectrix-space/ignite/tree/main/example)をそのまま使用しています。  
このテンプレートにはサンプルとして以下の Mixin が含まれています。  

- [Mixin で`/hello`コマンドの追加](src/main/java/space/vectrix/example/mixin/core/MixinSimpleCommandMap.java)
- [Mixin でサーバー起動時に`Hello World!`と表示する](src/main/java/space/vectrix/example/mixin/core/MixinCraftServer.java)
- [Ignite でコンフィグ追加](src/main/java/space/vectrix/example/ExampleConfig.java)
