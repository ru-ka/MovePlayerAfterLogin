## Introduzione

Questo plugin, così come dice la descrizione, sposta automaticamente i player dopo il login o la registrazione ad un server specificato nel `config.yml`.

E' utile in caso AuthMe dia problemi con le nuove versioni o abbia conflitti con altri plugin. 

## Installazione

Per installare il plugin è sufficiente mettere il file nella cartella plugins del server dove viene effettuata l'autenticazione (lo stesso di AuthMe).

## Configurazione

Il plugin al primo avvio genera nella cartella dall'omonimo nome [del plugin] un file `config.yml` che si dovrebbe palesare così:

```yaml
server_name: survival
```

Ora basterà cambiare il nome `survival` con il nome del server a cui desiderate che i player vengano reindirizzati.
