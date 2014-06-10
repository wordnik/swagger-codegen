#!/usr/bin/env python
"""
WordAPI.py
Copyright 2014 Wordnik, Inc.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
"""
import sys
import os

from .models import *


class WordApi(object):

    def __init__(self, apiClient):
      self.apiClient = apiClient

    

    def getExamples(self, word, **kwargs):
        """Returns examples for a word

        Args:
            word, str: Word to return examples for (required)

            includeDuplicates, str: Show duplicate examples from different sources (optional)

            useCanonical, str: If true will try to return the correct word root ('cats' -&gt; 'cat'). If false returns exactly what was requested. (optional)

            skip, int: Results to skip (optional)

            limit, int: Maximum number of results to return (optional)

            

        Returns: ExampleSearchResults
        """

        allParams = ['word', 'includeDuplicates', 'useCanonical', 'skip', 'limit']

        params = locals()
        for (key, val) in params['kwargs'].items():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method getExamples" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/word.{format}/{word}/examples'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'GET'

        queryParams = {}
        headerParams = {}

        if ('includeDuplicates' in params):
            queryParams['includeDuplicates'] = self.apiClient.toPathValue(params['includeDuplicates'])
        if ('useCanonical' in params):
            queryParams['useCanonical'] = self.apiClient.toPathValue(params['useCanonical'])
        if ('skip' in params):
            queryParams['skip'] = self.apiClient.toPathValue(params['skip'])
        if ('limit' in params):
            queryParams['limit'] = self.apiClient.toPathValue(params['limit'])
        if ('word' in params):
            replacement = str(self.apiClient.toPathValue(params['word']))
            resourcePath = resourcePath.replace('{' + 'word' + '}',
                                                replacement)
        postData = (params['body'] if 'body' in params else None)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams)

        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'ExampleSearchResults')
        return responseObject
        

        

    def getWord(self, word, **kwargs):
        """Given a word as a string, returns the WordObject that represents it

        Args:
            word, str: String value of WordObject to return (required)

            useCanonical, str: If true will try to return the correct word root ('cats' -&gt; 'cat'). If false returns exactly what was requested. (optional)

            includeSuggestions, str: Return suggestions (for correct spelling, case variants, etc.) (optional)

            

        Returns: WordObject
        """

        allParams = ['word', 'useCanonical', 'includeSuggestions']

        params = locals()
        for (key, val) in params['kwargs'].items():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method getWord" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/word.{format}/{word}'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'GET'

        queryParams = {}
        headerParams = {}

        if ('useCanonical' in params):
            queryParams['useCanonical'] = self.apiClient.toPathValue(params['useCanonical'])
        if ('includeSuggestions' in params):
            queryParams['includeSuggestions'] = self.apiClient.toPathValue(params['includeSuggestions'])
        if ('word' in params):
            replacement = str(self.apiClient.toPathValue(params['word']))
            resourcePath = resourcePath.replace('{' + 'word' + '}',
                                                replacement)
        postData = (params['body'] if 'body' in params else None)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams)

        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'WordObject')
        return responseObject
        

        

    def getDefinitions(self, word, **kwargs):
        """Return definitions for a word

        Args:
            word, str: Word to return definitions for (required)

            partOfSpeech, str: CSV list of part-of-speech types (optional)

            sourceDictionaries, str: Source dictionary to return definitions from.  If 'all' is received, results are returned from all sources. If multiple values are received (e.g. 'century,wiktionary'), results are returned from the first specified dictionary that has definitions. If left blank, results are returned from the first dictionary that has definitions. By default, dictionaries are searched in this order: ahd, wiktionary, webster, century, wordnet (optional)

            limit, int: Maximum number of results to return (optional)

            includeRelated, str: Return related words with definitions (optional)

            useCanonical, str: If true will try to return the correct word root ('cats' -&gt; 'cat'). If false returns exactly what was requested. (optional)

            includeTags, str: Return a closed set of XML tags in response (optional)

            

        Returns: list[Definition]
        """

        allParams = ['word', 'partOfSpeech', 'sourceDictionaries', 'limit', 'includeRelated', 'useCanonical', 'includeTags']

        params = locals()
        for (key, val) in params['kwargs'].items():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method getDefinitions" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/word.{format}/{word}/definitions'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'GET'

        queryParams = {}
        headerParams = {}

        if ('limit' in params):
            queryParams['limit'] = self.apiClient.toPathValue(params['limit'])
        if ('partOfSpeech' in params):
            queryParams['partOfSpeech'] = self.apiClient.toPathValue(params['partOfSpeech'])
        if ('includeRelated' in params):
            queryParams['includeRelated'] = self.apiClient.toPathValue(params['includeRelated'])
        if ('sourceDictionaries' in params):
            queryParams['sourceDictionaries'] = self.apiClient.toPathValue(params['sourceDictionaries'])
        if ('useCanonical' in params):
            queryParams['useCanonical'] = self.apiClient.toPathValue(params['useCanonical'])
        if ('includeTags' in params):
            queryParams['includeTags'] = self.apiClient.toPathValue(params['includeTags'])
        if ('word' in params):
            replacement = str(self.apiClient.toPathValue(params['word']))
            resourcePath = resourcePath.replace('{' + 'word' + '}',
                                                replacement)
        postData = (params['body'] if 'body' in params else None)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams)

        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'list[Definition]')
        return responseObject
        

        

    def getTopExample(self, word, **kwargs):
        """Returns a top example for a word

        Args:
            word, str: Word to fetch examples for (required)

            useCanonical, str: If true will try to return the correct word root ('cats' -&gt; 'cat'). If false returns exactly what was requested. (optional)

            

        Returns: Example
        """

        allParams = ['word', 'useCanonical']

        params = locals()
        for (key, val) in params['kwargs'].items():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method getTopExample" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/word.{format}/{word}/topExample'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'GET'

        queryParams = {}
        headerParams = {}

        if ('useCanonical' in params):
            queryParams['useCanonical'] = self.apiClient.toPathValue(params['useCanonical'])
        if ('word' in params):
            replacement = str(self.apiClient.toPathValue(params['word']))
            resourcePath = resourcePath.replace('{' + 'word' + '}',
                                                replacement)
        postData = (params['body'] if 'body' in params else None)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams)

        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'Example')
        return responseObject
        

        

    def getRelatedWords(self, word, **kwargs):
        """Given a word as a string, returns relationships from the Word Graph

        Args:
            word, str: Word to fetch relationships for (required)

            relationshipTypes, str: Limits the total results per type of relationship type (optional)

            useCanonical, str: If true will try to return the correct word root ('cats' -&gt; 'cat'). If false returns exactly what was requested. (optional)

            limitPerRelationshipType, int: Restrict to the supplied relatinship types (optional)

            

        Returns: list[Related]
        """

        allParams = ['word', 'relationshipTypes', 'useCanonical', 'limitPerRelationshipType']

        params = locals()
        for (key, val) in params['kwargs'].items():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method getRelatedWords" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/word.{format}/{word}/relatedWords'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'GET'

        queryParams = {}
        headerParams = {}

        if ('useCanonical' in params):
            queryParams['useCanonical'] = self.apiClient.toPathValue(params['useCanonical'])
        if ('relationshipTypes' in params):
            queryParams['relationshipTypes'] = self.apiClient.toPathValue(params['relationshipTypes'])
        if ('limitPerRelationshipType' in params):
            queryParams['limitPerRelationshipType'] = self.apiClient.toPathValue(params['limitPerRelationshipType'])
        if ('word' in params):
            replacement = str(self.apiClient.toPathValue(params['word']))
            resourcePath = resourcePath.replace('{' + 'word' + '}',
                                                replacement)
        postData = (params['body'] if 'body' in params else None)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams)

        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'list[Related]')
        return responseObject
        

        

    def getTextPronunciations(self, word, **kwargs):
        """Returns text pronunciations for a given word

        Args:
            word, str: Word to get pronunciations for (required)

            sourceDictionary, str: Get from a single dictionary (optional)

            typeFormat, str: Text pronunciation type (optional)

            useCanonical, str: If true will try to return a correct word root ('cats' -&gt; 'cat'). If false returns exactly what was requested. (optional)

            limit, int: Maximum number of results to return (optional)

            

        Returns: list[TextPron]
        """

        allParams = ['word', 'sourceDictionary', 'typeFormat', 'useCanonical', 'limit']

        params = locals()
        for (key, val) in params['kwargs'].items():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method getTextPronunciations" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/word.{format}/{word}/pronunciations'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'GET'

        queryParams = {}
        headerParams = {}

        if ('useCanonical' in params):
            queryParams['useCanonical'] = self.apiClient.toPathValue(params['useCanonical'])
        if ('sourceDictionary' in params):
            queryParams['sourceDictionary'] = self.apiClient.toPathValue(params['sourceDictionary'])
        if ('typeFormat' in params):
            queryParams['typeFormat'] = self.apiClient.toPathValue(params['typeFormat'])
        if ('limit' in params):
            queryParams['limit'] = self.apiClient.toPathValue(params['limit'])
        if ('word' in params):
            replacement = str(self.apiClient.toPathValue(params['word']))
            resourcePath = resourcePath.replace('{' + 'word' + '}',
                                                replacement)
        postData = (params['body'] if 'body' in params else None)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams)

        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'list[TextPron]')
        return responseObject
        

        

    def getHyphenation(self, word, **kwargs):
        """Returns syllable information for a word

        Args:
            word, str: Word to get syllables for (required)

            sourceDictionary, str: Get from a single dictionary. Valid options: ahd, century, wiktionary, webster, and wordnet. (optional)

            useCanonical, str: If true will try to return a correct word root ('cats' -&gt; 'cat'). If false returns exactly what was requested. (optional)

            limit, int: Maximum number of results to return (optional)

            

        Returns: list[Syllable]
        """

        allParams = ['word', 'sourceDictionary', 'useCanonical', 'limit']

        params = locals()
        for (key, val) in params['kwargs'].items():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method getHyphenation" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/word.{format}/{word}/hyphenation'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'GET'

        queryParams = {}
        headerParams = {}

        if ('useCanonical' in params):
            queryParams['useCanonical'] = self.apiClient.toPathValue(params['useCanonical'])
        if ('sourceDictionary' in params):
            queryParams['sourceDictionary'] = self.apiClient.toPathValue(params['sourceDictionary'])
        if ('limit' in params):
            queryParams['limit'] = self.apiClient.toPathValue(params['limit'])
        if ('word' in params):
            replacement = str(self.apiClient.toPathValue(params['word']))
            resourcePath = resourcePath.replace('{' + 'word' + '}',
                                                replacement)
        postData = (params['body'] if 'body' in params else None)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams)

        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'list[Syllable]')
        return responseObject
        

        

    def getWordFrequency(self, word, **kwargs):
        """Returns word usage over time

        Args:
            word, str: Word to return (required)

            useCanonical, str: If true will try to return the correct word root ('cats' -&gt; 'cat'). If false returns exactly what was requested. (optional)

            startYear, int: Starting Year (optional)

            endYear, int: Ending Year (optional)

            

        Returns: FrequencySummary
        """

        allParams = ['word', 'useCanonical', 'startYear', 'endYear']

        params = locals()
        for (key, val) in params['kwargs'].items():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method getWordFrequency" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/word.{format}/{word}/frequency'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'GET'

        queryParams = {}
        headerParams = {}

        if ('useCanonical' in params):
            queryParams['useCanonical'] = self.apiClient.toPathValue(params['useCanonical'])
        if ('startYear' in params):
            queryParams['startYear'] = self.apiClient.toPathValue(params['startYear'])
        if ('endYear' in params):
            queryParams['endYear'] = self.apiClient.toPathValue(params['endYear'])
        if ('word' in params):
            replacement = str(self.apiClient.toPathValue(params['word']))
            resourcePath = resourcePath.replace('{' + 'word' + '}',
                                                replacement)
        postData = (params['body'] if 'body' in params else None)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams)

        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'FrequencySummary')
        return responseObject
        

        

    def getPhrases(self, word, **kwargs):
        """Fetches bi-gram phrases for a word

        Args:
            word, str: Word to fetch phrases for (required)

            limit, int: Maximum number of results to return (optional)

            wlmi, int: Minimum WLMI for the phrase (optional)

            useCanonical, str: If true will try to return the correct word root ('cats' -&gt; 'cat'). If false returns exactly what was requested. (optional)

            

        Returns: list[Bigram]
        """

        allParams = ['word', 'limit', 'wlmi', 'useCanonical']

        params = locals()
        for (key, val) in params['kwargs'].items():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method getPhrases" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/word.{format}/{word}/phrases'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'GET'

        queryParams = {}
        headerParams = {}

        if ('limit' in params):
            queryParams['limit'] = self.apiClient.toPathValue(params['limit'])
        if ('wlmi' in params):
            queryParams['wlmi'] = self.apiClient.toPathValue(params['wlmi'])
        if ('useCanonical' in params):
            queryParams['useCanonical'] = self.apiClient.toPathValue(params['useCanonical'])
        if ('word' in params):
            replacement = str(self.apiClient.toPathValue(params['word']))
            resourcePath = resourcePath.replace('{' + 'word' + '}',
                                                replacement)
        postData = (params['body'] if 'body' in params else None)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams)

        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'list[Bigram]')
        return responseObject
        

        

    def getEtymologies(self, word, **kwargs):
        """Fetches etymology data

        Args:
            word, str: Word to return (required)

            useCanonical, str: If true will try to return the correct word root ('cats' -&gt; 'cat'). If false returns exactly what was requested. (optional)

            

        Returns: list[str]
        """

        allParams = ['word', 'useCanonical']

        params = locals()
        for (key, val) in params['kwargs'].items():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method getEtymologies" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/word.{format}/{word}/etymologies'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'GET'

        queryParams = {}
        headerParams = {}

        if ('useCanonical' in params):
            queryParams['useCanonical'] = self.apiClient.toPathValue(params['useCanonical'])
        if ('word' in params):
            replacement = str(self.apiClient.toPathValue(params['word']))
            resourcePath = resourcePath.replace('{' + 'word' + '}',
                                                replacement)
        postData = (params['body'] if 'body' in params else None)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams)

        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'list[str]')
        return responseObject
        

        

    def getAudio(self, word, **kwargs):
        """Fetches audio metadata for a word.

        Args:
            word, str: Word to get audio for. (required)

            useCanonical, str: Use the canonical form of the word (optional)

            limit, int: Maximum number of results to return (optional)

            

        Returns: list[AudioFile]
        """

        allParams = ['word', 'useCanonical', 'limit']

        params = locals()
        for (key, val) in params['kwargs'].items():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method getAudio" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/word.{format}/{word}/audio'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'GET'

        queryParams = {}
        headerParams = {}

        if ('useCanonical' in params):
            queryParams['useCanonical'] = self.apiClient.toPathValue(params['useCanonical'])
        if ('limit' in params):
            queryParams['limit'] = self.apiClient.toPathValue(params['limit'])
        if ('word' in params):
            replacement = str(self.apiClient.toPathValue(params['word']))
            resourcePath = resourcePath.replace('{' + 'word' + '}',
                                                replacement)
        postData = (params['body'] if 'body' in params else None)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams)

        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'list[AudioFile]')
        return responseObject
        

        

    def getScrabbleScore(self, word, **kwargs):
        """Returns the Scrabble score for a word

        Args:
            word, str: Word to get scrabble score for. (required)

            

        Returns: ScrabbleScoreResult
        """

        allParams = ['word']

        params = locals()
        for (key, val) in params['kwargs'].items():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method getScrabbleScore" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/word.{format}/{word}/scrabbleScore'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'GET'

        queryParams = {}
        headerParams = {}

        if ('word' in params):
            replacement = str(self.apiClient.toPathValue(params['word']))
            resourcePath = resourcePath.replace('{' + 'word' + '}',
                                                replacement)
        postData = (params['body'] if 'body' in params else None)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams)

        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'ScrabbleScoreResult')
        return responseObject
        

        

    




