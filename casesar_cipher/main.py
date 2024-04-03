ALPHABET = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
KEY = 9

def caesar_encrypt(plain_text):
  cipher_text = ''
  plain_text = plain_text.upper()
  for c in plain_text:
    if c == ' ':  # Handle spaces
      cipher_text += c
      continue
    index = ALPHABET.find(c)
    index = (index + KEY) % len(ALPHABET)
    cipher_text = cipher_text + ALPHABET[index]

  return cipher_text

def caesar_decrypt(cipher_text):
  plain_text = ''
  for c in cipher_text:
    if c == ' ':
      plain_text += c
      continue
    index = ALPHABET.find(c)
    if index == -1:
      plain_text += c
      continue
    index = (index - KEY) % len(ALPHABET)
    plain_text = plain_text + ALPHABET[index]

  return plain_text

encrypted_message = caesar_encrypt('Hello World')
print('---Encrypted Message---')
print(encrypted_message)
print(' ')
print('---Decrypted Message---')
print(caesar_decrypt(encrypted_message))
