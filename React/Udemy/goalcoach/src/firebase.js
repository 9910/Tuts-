import * as firebase from 'firebase';

const config = {
    apiKey: "AIzaSyBxbYocVaKxF1_JpCpTp52HhW0u5V79gFc",
    authDomain: "goalcoach-17cfd.firebaseapp.com",
    databaseURL: "https://goalcoach-17cfd.firebaseio.com",
    projectId: "goalcoach-17cfd",
    storageBucket: "goalcoach-17cfd.appspot.com",
    messagingSenderId: "1024768804684"
};

export const firebaseApp = firebase.initializeApp(config);
export const goalRef = firebase.database().ref('goals');