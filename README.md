# Gamification Spring Integration
Classes para integração do Esfinge Gamification e o Spring framework.


## Modo de Usar:


*   Clone o projeto, mvn install
*	Adicione o gamification-spring nas suas dependências
*	Adicione o pacote com.pedrocavalero.gamification em seu @ComponentScan
*   Habilite o AspecJAutoproxy (@EnableAspectJAutoProxy) para permitir a interceptação das classes a serem gamificadas.
*	Coloque a anotação @GamificationAware na classe com as anotações do [Esfinge Gamification](https://github.com/EsfingeFramework/gamification "Github")  (se não sabe usar o Esfinge Gamification clique [aqui](http://esfinge.sourceforge.net/Gamification.html "Esfinge Gamification") )

Pronto!

	<dependency>
		<groupId>com.pedrocavalero.gamification</groupId>
		<artifactId>gamification-spring</artifactId>
		<version>0.0.1-SNAPSHOT</version>
	</dependency>
	

 
