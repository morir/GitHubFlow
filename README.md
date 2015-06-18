# GitHubFlow  
  
## role: **管理人:** 1人, **レビューワ:** 数人, **コーダ:** 数人  

### ルール 
---- 
* github 上でのコミュニケーションになれるため、なるべく会話しないで Pull Request 上でコミュニケーション取りましょう。  
* なのですぐ github アカウントですぐに確認できるメールアドレスを設定してください。  
  
  
### ISSUE  
----   
* SpellChecker の実装、 check() メソッド    
* WordDictionary の実装, containts(), addWord(), getAllWord() メソッド
* CheckResult の実装, constractor, getter 2 つ  
* MainPaneController の実装, addButtonFired()  メソッド

### 手順
---- 
1. **管理人** (GitHub) このリポジトリを自分のアカウントにフォークします。  
2. **管理人** (GitHub) フォークしたリポジトリのコントリビューターに**レビューワ** **コーダ**を追加します。  
3. **コーダ** (開発環境) リポジトリをローカル環境に Clone します。
3. **管理人** (GitHub) 開発案件毎に issue を作成し、**コーダ** にアサインします。  
4. **コーダ** (GitHub) issue を確認し、master ブランチから ”Issue_#x” (x は issue 番号) でブランチを切ります。
5. **コーダ** (開発環境) ブランチを自分の担当ブランチに切り替えます。 
  ``` git pull ```  
  ``` git checkout Issue_#x```  

6. **コーダ** (開発環境) 空のコミットを作成し push します。   
  ``` git commit --allow-empty -m "Issue_#x" ```  
  ``` git push```  
7. **コーダ** (GitHub) ブランチの pull Request を "[WIP] Issue_#x" というタイトルで作成します。  
8. **コーダ** (開発環境) 開発します。必要に応じて commit してください。
  ``` git add . ```  
  ``` git commit -m "closes issue #3" ```  

9. **コーダ** (開発環境) 開発が終了し、動作確認ができたら Push します。  
10. **コーダ** (GitHub) pull request のタイトルから [WIP] を除去し、コメント欄にて (@レビューワ名をつけて) **レビューワ** にレビュー依頼コメントを書きます。  
11. **レビューワ** (GitHub) 該当の pull request 上でレビューします。必要に応じて指摘してください。問題なければ管理人とコーダにレビュー完了をコメントしてください。  
12. **管理人** (GitHub) pull request をマージします。  
