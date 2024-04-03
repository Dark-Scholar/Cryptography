# Cryptography

Cryptography is the art of encoding and decoding information.
When we talk about cryptography engineering we are usually talking about
building algorithms in which to securely encrypt data.

In doing so we have different forms of crypto systems which have been developed
over the years. At the most basic level of abstraction this can be split into
symmetric and asymmetric crypto systems.

## Symmetric Crypto Systems

Symmetric crypto systems are systems which use just a single key.
These systems may be used to share data in which only we want to
have access to the data, or the person on the other end knows our key.
Since we only have a private key we don't want to share this key with
just anyone.

The main problem here us that the private key must be exchanged, there would
also be many keys in a large network of users. For every pair of users we would
need a unique private key.

(examples: AES, DES, RC4, Caesar Cipher)

## Asymmetric Crypto Systems

If symmetric crypto systems are private key crypto systems asymmetric crypto systems
are public crypto systems. In asymmetric systems we take a plantext and use the public key to transform our plaintext into ciphertext via the encryption function.

If we want to decrypt the ciphertext we then need to use our private key to decrypt the ciphertext back into a readable plaintext format. Technically, we could get the private key by reverse engineering the public key, but the point in cryptography is to make this task so computationally complex that it is not feasible to do so in a reasonable time frame, essentially rendering it "impossible".

(examples: RSA, ECC, DSA, ECDSA , Diffie-Hellman Key Exchange).

When using this system we must keep the private key secret. The public key is known to anyone on the network. If user A wants to send user B a message, user A will encrypt the message with user B's public key, user B will then use their private key to decrypt the message.

## Contents

1. [Caesar Cipher](./chapters/caesar_cipher.md)
2. [Vigenère Cipher](./vigenere_cipher.md)
3. [One Time Pad](./one_time_pad.md)
4. [Data Encryption Standard](./data_encryption_standard.md)
5. [Advanced Encryption Standard](./advanced_encryption_standard.md)
6. [Shannon's Confusion and Diffusion](./shannons_confusion_and_diffusion.md)
