import {NativeModules} from 'react-native';

const {HelloWorldModule} = NativeModules;

export function printName(value) {
  HelloWorldModule.print(value);
}
