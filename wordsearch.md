potato
 oe
osmacros
  ae
  t l
potato
  e


what datastructure do I need for this? a multi-dictionary, where each word is:
* stored in groups by letter in each position
*



for each word, construct its indexes as a binary mask over the string. these can then be collected together to create a set of all indices.

```
indices('potato') = {
  'potat_', 'pota_o', 'pota__', 'pot_to', ... , '_____o', '______'
}

indices('potata') = {
  'potat_', 'pota_a', 'pota__', 'pot_ta', ... , '_____a', '______'
}

indices = reduce(includes, words)

index = Map(keys: indices, values: Map)

options('pot__')
```

maybe it's a caching thing? compute the set of options for a given index on demand by searching the entire wordlist, but first we check if a more open index already exists: 'pot__' will be empty if any of 'po___', 'p_t__', ... are empty.
